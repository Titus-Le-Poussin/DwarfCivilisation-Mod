package net.TitusTheDuck.dwarfcivilisation.container;

import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.TitusTheDuck.dwarfcivilisation.tileentity.DwarfFurnaceTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nullable;

public class DwarfFurnaceContainer extends Container {
    private  final TileEntity tileEntity;
    private final PlayerEntity playerEntity;
    private final IItemHandler playerInventory;


    public DwarfFurnaceContainer (int windowId, World world, BlockPos pos,
                                  PlayerInventory playerInventory, PlayerEntity player) {
        super(ModContainers.DWARF_FURNACE_CONTAINER.get(), windowId);
        this.tileEntity = world.getTileEntity(pos);
        playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);
        layoutPlayerInventorySlots(8, 86);

        if(tileEntity != null) {
            tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
                addSlot(new SlotItemHandler(h, 0, 61, 36 ));
                addSlot(new SlotItemHandler(h, 1, 24, 36 ));
                addSlot(new SlotItemHandler(h, 2, 110, 45 ){
    @Override
    public boolean canTakeStack(PlayerEntity playerIn) {
        // Vérifie qu'il y a bien la Silver Nugget
        return getHasStack();
    }

@Override
public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack) {
    IItemHandler handler = this.getItemHandler();
    handler.getStackInSlot(0).shrink(1);
    handler.getStackInSlot(1).shrink(1);
    // Après avoir consommé, le slot 2 sera vidé par le super.onTake
    putStack(ItemStack.EMPTY);
    return super.onTake(thePlayer, stack);
}
});
            });

        }

    }



    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos()), playerIn, ModBlocks.DWARF_FURNACE.get());
    }

    private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx) {
        for (int i = 0 ; i < amount ; i++){
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }
    private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0 ; j < verAmount ; j++) {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(int leftCol, int topRow) {
        // Player inventory
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }

    //OSKOUR EXPLIQUE MOI SA COPILOT, il a copié collé

    //must assign a slot number to each of the slots used by the GUI. 
    //For this container, we can see both the tileinventory's slot as weel as the player invotory slot and the hotbar slots.
    // 0 - 8 = hotbar slot (which will map to the InventoryPlayer Slot number 0 - 8)
    // 9 - 35 = player inventory slots (which will map to the InventoryPlayer Slot number 9 - 35)
    // 36 - 44 = TileInventory slots, which map to our TileEntity slot number 0 - 8

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_ROW_COUNT * PLAYER_INVENTORY_COLUMN_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;



    private static final int TE_INVENTORY_SLOT_COUNT = 3; 
    // 3 slot dans le four nain

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        Slot sourceSlot = inventorySlots.get(index);
        if (sourceSlot == null || !sourceSlot.getHasStack()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getStack();
        ItemStack copyOfSourceStack = sourceStack.copy();


        //check if the slot cliked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // this is a vanilla container slot so merge the stack into tile inventory
            if (!mergeItemStack(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY; // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // this is a TE slot so merge the stack into the players inventory
            if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY; 
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // if Stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.putStack(ItemStack.EMPTY);
        } else {
            sourceSlot.onSlotChanged();
        }

        sourceSlot.onTake(playerEntity, sourceStack);
        return copyOfSourceStack;

        }
    }
