package net.TitusTheDuck.dwarfcivilisation.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.items.SlotItemHandler;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfHerboristEntity;

public class DwarfHerboristContainer extends Container {

    private final DwarfHerboristEntity entity;

    public DwarfHerboristContainer(int windowId, PlayerInventory playerInventory, DwarfHerboristEntity entity) {
        super(ModContainers.DWARF_HERBORIST_CONTAINER.get(), windowId);
        this.entity = entity;

        // Slots de l'herboriste (12 slots, 3 colonnes x 4 lignes)
        // Premier slot à x=97, y=7
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                this.addSlot(new SlotItemHandler(entity.getInventory(), col + row * 3,
                        97 + col * 18, 7 + row * 18));
            }
        }

        // Inventaire du joueur (3 lignes de 9 slots)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9,
                        8 + col * 18, 86 + row * 18));  // Change de 7 à 8
            }
        }

        // Hotbar du joueur
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 144));  // Change de 7 à 8
        }
    }

    // Constructeur côté client
    public DwarfHerboristContainer(int windowId, PlayerInventory playerInventory, PacketBuffer extraData) {
        this(windowId, playerInventory,
                (DwarfHerboristEntity) playerInventory.player.world.getEntityByID(extraData.readInt()));
    }

    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return this.entity.isAlive() && player.getDistanceSq(this.entity) < 64.0D;
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack stackInSlot = slot.getStack();
            itemstack = stackInSlot.copy();

            if (index < 12) {
                // De l'herboriste vers le joueur
                if (!this.mergeItemStack(stackInSlot, 12, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                // Du joueur vers l'herboriste
                if (!this.mergeItemStack(stackInSlot, 0, 12, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (stackInSlot.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }
}