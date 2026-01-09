package net.TitusTheDuck.dwarfcivilisation.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.container.slot.ArmorSlot;
import net.TitusTheDuck.dwarfcivilisation.container.slot.WeaponSlot;

public class DwarfWarriorContainer extends Container {

    private final DwarfWarriorEntity entity;
    private final PlayerInventory playerInventory;

    // Constructeur côté serveur
    public DwarfWarriorContainer(int windowId, PlayerInventory playerInventory, DwarfWarriorEntity entity) {
        super(ModContainers.DWARF_WARRIOR_CONTAINER.get(), windowId);
        this.entity = entity;
        this.playerInventory = playerInventory;

        // Slots de l'entité (équipement du nain)
        // Casque - x: 25, y: 4
        this.addSlot(new ArmorSlot(entity.getInventory(), DwarfWarriorEntity.HELMET_SLOT, 25, 4));

        // Plastron - x: 25, y: 24
        this.addSlot(new ArmorSlot(entity.getInventory(), DwarfWarriorEntity.CHESTPLATE_SLOT, 25, 24));

        // Jambières - x: 25, y: 44
        this.addSlot(new ArmorSlot(entity.getInventory(), DwarfWarriorEntity.LEGGINGS_SLOT, 25, 44));

        // Bottes - x: 25, y: 64
        this.addSlot(new ArmorSlot(entity.getInventory(), DwarfWarriorEntity.BOOTS_SLOT, 25, 64));

        // Épée - x: 46, y: 24
        this.addSlot(new WeaponSlot(entity.getInventory(), DwarfWarriorEntity.WEAPON_SLOT, 46, 24));

        // Inventaire du joueur (3 lignes de 9 slots)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }

        // Hotbar du joueur (1 ligne de 9 slots)
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }

    // Constructeur côté client
    public DwarfWarriorContainer(int windowId, PlayerInventory playerInventory, PacketBuffer extraData) {
        this(windowId, playerInventory, (DwarfWarriorEntity) playerInventory.player.world.getEntityByID(extraData.readInt()));
    }

    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return this.entity.isAlive() && player.getDistanceSq(this.entity) < 64.0D;
    }

    // Gestion du shift-click
    @Override
    public ItemStack transferStackInSlot(PlayerEntity player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack stackInSlot = slot.getStack();
            itemstack = stackInSlot.copy();

            // Si l'item vient de l'équipement du nain (slots 0-4)
            if (index < 5) {
                // Essaie de le mettre dans l'inventaire du joueur
                if (!this.mergeItemStack(stackInSlot, 5, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                // Si l'item vient de l'inventaire du joueur
                // Essaie de le mettre dans l'équipement du nain
                boolean placed = false;

                // Essaie chaque slot d'équipement
                for (int i = 0; i < 5; i++) {
                    Slot equipSlot = this.inventorySlots.get(i);
                    if (equipSlot.isItemValid(stackInSlot) && !equipSlot.getHasStack()) {
                        ItemStack copy = stackInSlot.copy();
                        copy.setCount(1);
                        equipSlot.putStack(copy);
                        stackInSlot.shrink(1);
                        placed = true;
                        break;
                    }
                }

                if (!placed) {
                    return ItemStack.EMPTY;
                }
            }

            if (stackInSlot.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (stackInSlot.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, stackInSlot);
        }

        return itemstack;
    }

    public DwarfWarriorEntity getEntity() {
        return this.entity;
    }
}