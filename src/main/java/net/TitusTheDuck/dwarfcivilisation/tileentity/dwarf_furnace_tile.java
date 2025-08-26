package net.TitusTheDuck.dwarfcivilisation.tileentity;

import net.TitusTheDuck.dwarfcivilisation.registry.modtileentities;
import net.TitusTheDuck.dwarfcivilisation.item.moditems;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class dwarf_furnace_tile extends TileEntity implements ITickableTileEntity {

    private boolean hasLava = false;
    private int cookTime = 0;
    private ItemStack input = ItemStack.EMPTY;
    private ItemStack hammer = ItemStack.EMPTY;
    private ItemStack output = ItemStack.EMPTY;

    public dwarf_furnace_tile() {
        super(modtileentities.DWARF_FURNACE_TILE.get());
    }

    @Override
    public void tick() {
        if (level == null || level.isClientSide) return;

        if (hasLava && !input.isEmpty() && !hammer.isEmpty()) {
            cookTime++;

            if (cookTime >= 200) { // 10 secondes
                if (input.getItem() == moditems.MYTHRIL_ORE.get() && hammer.getItem() == moditems.HAMMER.get()) {
                    input.shrink(1);
                    hammer.hurtAndBreak(1, null, (p) -> {});
                    output = new ItemStack(moditems.MYTHRIL_INGOT.get());
                }
                cookTime = 0;
                setChanged();
            }
        } else {
            cookTime = 0;
        }
    }

    public boolean hasLava() {
        return hasLava;
    }

    public void setHasLava(boolean lava) {
        this.hasLava = lava;
        setChanged();
    }
}
