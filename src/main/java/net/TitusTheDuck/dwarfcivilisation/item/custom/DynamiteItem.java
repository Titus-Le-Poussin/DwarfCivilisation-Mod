package net.TitusTheDuck.dwarfcivilisation.item.custom;

import net.TitusTheDuck.dwarfcivilisation.entity.DynamiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class DynamiteItem extends Item {

    public DynamiteItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!world.isRemote) {
            DynamiteEntity dynamite = new DynamiteEntity(world, player);
            dynamite.setVelocity(player.getLookVec().x, player.getLookVec().y, player.getLookVec().z); // Définit la direction et la vitesse
            world.addEntity(dynamite); // Ajoute l'entité au monde
        }

        if (!player.abilities.isCreativeMode) {
            itemstack.shrink(1); // Réduit la quantité de dynamite dans la main
        }

        return ActionResult.resultSuccess(itemstack);
    }
}