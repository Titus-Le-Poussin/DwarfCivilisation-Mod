package net.TitusTheDuck.dwarfcivilisation.tileentity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.item.ModItems;
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

    public DwarfFurnaceTileEntity() {
        this(ModTileEntities.DWARF_FURNACE_TILE.get());
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
                DwarfFurnaceHasStruck();
            }
            @Override
            public boolean isItemValid(int slot, ItemStack stack) {
                switch (slot) {
                    case 0:
                        return stack.getItem() == Items.IRON_INGOT;
                    case 1:
                        return stack.getItem() == Items.LAVA_BUCKET;
                    case 2:
                        return stack.getItem() == ModItems.SILVER_NUGGET.get();
                    default:
                        return false;

                }
            }
            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if (slot == 0 && stack.getItem() != Items.IRON_INGOT) {
                    return stack;
                }
                if (slot == 1 && stack.getItem() != Items.LAVA_BUCKET) {
                    return stack;
                }
                return super.insertItem(slot, stack, simulate);
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return handler.cast();
        }
        return super.getCapability(cap, side);
    }

// ...existing code...
public void DwarfFurnaceHasStruck() {
    ItemStack input = this.itemHandler.getStackInSlot(0);
    ItemStack fuel = this.itemHandler.getStackInSlot(1);
    ItemStack output = this.itemHandler.getStackInSlot(2);

    boolean hasLava = fuel.getItem() == Items.LAVA_BUCKET;
    boolean outputEmpty = output.isEmpty();

    // Exemple : transformation en dur
    if (input.getItem() == Items.IRON_INGOT && hasLava && outputEmpty) {
        ItemStack result = new ItemStack(ModItems.SILVER_NUGGET.get());
        ItemStack remainder = this.itemHandler.insertItem(2, result, false);
        if (remainder.isEmpty()) {
            System.out.println("Crafting successful");
            // Ici, tu peux gérer la consommation des items
        }
    }
}}
// ...existing code...
        


