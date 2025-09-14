package net.TitusTheDuck.dwarfcivilisation.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HammerItem extends PickaxeItem {
    public HammerItem(IItemTier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, BlockState blockState, BlockPos pos, LivingEntity entity) {
        boolean result = super.onBlockDestroyed(item, world, blockState, pos, entity);

        if (!world.isRemote && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            Direction direction = getPlayerDirection(player);

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;

                    BlockPos targetPos;

                    switch (direction) {
                        case NORTH:
                        case SOUTH:
                            targetPos = new BlockPos(pos.getX() + i, pos.getY() + j, pos.getZ());
                            break;
                        case WEST:
                        case EAST:
                            targetPos = new BlockPos(pos.getX(), pos.getY() + j, pos.getZ() + i);
                            break;
                        case UP:
                        case DOWN:
                        default:
                            targetPos = new BlockPos(pos.getX() + i, pos.getY(), pos.getZ() + j);
                            break;
                    }

                    BlockState targetState = world.getBlockState(targetPos);

                    if (targetState.isAir()) {
                        continue;
                    }

                    if (!targetState.canHarvestBlock(world, targetPos, player)) {
                        continue;
                    }

                    
                    world.destroyBlock(targetPos, true);

                    if (item.isEmpty()) {
                        return result;
                    }
                }
            }
        }

        return result;
    }

    private Direction getPlayerDirection(PlayerEntity player) {
        if (player.rotationPitch < -45.0F) {
            return Direction.UP;
        } else if (player.rotationPitch > 45.0F) {
            return Direction.DOWN;
        } else {
            return player.getHorizontalFacing();
        }
    }
}