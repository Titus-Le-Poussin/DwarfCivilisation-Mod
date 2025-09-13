package net.TitusTheDuck.dwarfcivilisation.item.custom;
import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.TitusTheDuck.dwarfcivilisation.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AutoSmeltPickaxeItem extends PickaxeItem {
    public AutoSmeltPickaxeItem(IItemTier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, BlockState blockState, BlockPos pos, LivingEntity entity) {
        if (!world.isRemote && entity instanceof PlayerEntity) {
            Block block = blockState.getBlock();

            ItemStack smeltedItem = getSmeltedItem(block);

            if (!smeltedItem.isEmpty()) {
                smeltedItem.setCount(1);

                ItemEntity itemEntity = new ItemEntity(world,
                        pos.getX() + 0.5,
                        pos.getY() + 0.5,
                        pos.getZ() + 0.5,
                        smeltedItem);

                world.addEntity(itemEntity);
                world.destroyBlock(pos, false);
                return true;
            }
        }

        return super.onBlockDestroyed(item, world, blockState, pos, entity);
    }

    protected ItemStack getSmeltedItem(Block block) {
        if (block == Blocks.IRON_ORE) {
            return new ItemStack(Items.IRON_INGOT);
        }
        else if (block == Blocks.GOLD_ORE || block == Blocks.NETHER_GOLD_ORE) {
            return new ItemStack(Items.GOLD_INGOT);
        }
        else if (block == Blocks.ANCIENT_DEBRIS) {
            return new ItemStack(Items.NETHERITE_SCRAP);
        }
        else if (block == Blocks.SAND) {
            return new ItemStack(Blocks.GLASS);
        }
        else if (block == Blocks.COBBLESTONE) {
            return new ItemStack(Blocks.STONE);
        }
        else if (block == Blocks.NETHERRACK) {
            return new ItemStack(Items.NETHER_BRICK);
        }
        else if (block == ModBlocks.SILVER_ORE.get()){
            return new ItemStack(ModItems.SILVER_INGOT.get());
        }

        return ItemStack.EMPTY;
    }
}