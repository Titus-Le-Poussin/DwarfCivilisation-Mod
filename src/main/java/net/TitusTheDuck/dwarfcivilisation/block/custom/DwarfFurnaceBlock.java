package net.TitusTheDuck.dwarfcivilisation.block.custom;


import net.TitusTheDuck.dwarfcivilisation.container.DwarfFurnaceContainer;
import net.TitusTheDuck.dwarfcivilisation.tileentity.DwarfFurnaceTileEntity;
import net.TitusTheDuck.dwarfcivilisation.tileentity.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.TitusTheDuck.dwarfcivilisation.item.custom.DwarfFurnace;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;


public class DwarfFurnaceBlock extends HorizontalBlock {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public DwarfFurnaceBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

@Override
public BlockState rotate(BlockState state, Rotation rot) {
    return state.with(FACING, rot.rotate(state.get(FACING)));
}

@Override
public BlockState mirror(BlockState state, Mirror mirror) {
    return state.with(FACING, mirror.mirror(state.get(FACING)));
}


    @Override
protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    builder.add(FACING);
}

@Override
public BlockState getStateForPlacement(BlockItemUseContext context) {
    return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
}

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn,
                                             BlockPos pos, PlayerEntity player, Hand handIn,
                                             BlockRayTraceResult hit) {
        if (!worldIn.isRemote()) {
    TileEntity tileEntity = worldIn.getTileEntity(pos);

    if (tileEntity instanceof DwarfFurnaceTileEntity) {
        INamedContainerProvider containerProvider = createContainerProvider(worldIn, pos);
        NetworkHooks.openGui(((ServerPlayerEntity)player), containerProvider, tileEntity.getPos());

    } else {
        throw new IllegalStateException("MAMAMAMAMAMMAMA c'est PAS BON! ");
        
    }
}

        return ActionResultType.SUCCESS;
    }

    private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos) {
        return new INamedContainerProvider() {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.dwarfcivilisation.dwarf_furnace");
            }

            @Nullable
            @Override
            public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                return new DwarfFurnaceContainer(i, worldIn, pos, playerInventory, playerEntity);
            }
        };
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntities.DWARF_FURNACE_TILE.get().create();
    }

    @Override
    public boolean hasTileEntity(BlockState state){
        return true;
    }

    


}
