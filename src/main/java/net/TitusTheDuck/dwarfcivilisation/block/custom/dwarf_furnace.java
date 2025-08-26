package net.TitusTheDuck.dwarfcivilisation.block.custom;

import net.TitusTheDuck.dwarfcivilisation.tileentity.dwarf_furnace_tile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class dwarf_furnace extends Block {

    public dwarf_furnace(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new dwarf_furnace_tile();
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos,
                                PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);

        TileEntity tile = world.getBlockEntity(pos);
        if (!(tile instanceof dwarf_furnace_tile)) return ActionResultType.PASS;
        dwarf_furnace_tile furnace = (dwarf_furnace_tile) tile;

        // clic droit avec seau de lave
        if (heldItem.getItem() == Items.LAVA_BUCKET) {
            if (!furnace.hasLava()) {
                furnace.setHasLava(true);
                if (!player.isCreative()) {
                    player.setItemInHand(hand, new ItemStack(Items.BUCKET));
                }
                return ActionResultType.SUCCESS;
            }
        }

        return ActionResultType.SUCCESS;
    }
}
