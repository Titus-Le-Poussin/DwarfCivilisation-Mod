package net.TitusTheDuck.dwarfcivilisation.tileentity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class DwarfFurnaceTileEntity extends TileEntity {


    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);



    public DwarfFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    
        @Override
        public void read(BlockState state, CompoundNBT nbt) {
            itemHandler.deserializeNBT(nbt.getCompound("inv"));
            super.read(state, nbt);
        }

        @Override
        public CompoundNBT write(CompoundNBT compound) {
            compound.put("inv", itemHandler.serializeNBT());
            return super.write(compound);
        }




    private ItemStackHandler createHandler() {
        return new ItemStackHandler(3) {

            @Override
            protected void onContentsChanged(int slot) {
                markDirty();
            }
            @Override
            public boolean isItemValid(int slot, ItemStack stack) {
                switch (slot) {
                    case 1: return stack.getItem() == Items.LAVA_BUCKET;
                    default: return false;

                }
                @Nonnull
                @Override
                public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                    if (slot == 1 && stack.getItem() != Items.LAVA_BUCKET) {
                        return stack;
                    }
                return super.insertItem(slot, stack, simulate);
            }
        };
    }
}

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {

        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return handler.cast();
        }
        return super.getCapability(cap, side);
    }
}
