package net.TitusTheDuck.dwarfcivilisation.block.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.TitusTheDuck.dwarfcivilisation.item.custom.DwarfFurnace;


public class DwarfFurnaceBlock extends Block {
    public DwarfFurnaceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockClicked(World world, BlockPos pos, PlayerEntity player) {
        super.onBlockClicked(world, pos, player);
        if (!world.isClient) {
            world.setBlockState(pos, DwarfFurnace.getDefaultState());
        }
    }

}
