package net.TitusTheDuck.dwarfcivilisation.container.slot;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class WeaponSlot extends SlotItemHandler {

    public WeaponSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(@Nonnull ItemStack stack) {
        return stack.getItem() instanceof SwordItem;
    }

    @Override
    public int getSlotStackLimit() {
        return 1;
    }
}