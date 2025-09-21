package net.TitusTheDuck.dwarfcivilisation.item.custom;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;

public class waritem extends SwordItem {
    public waritem(IItemTier tier, int attackDamage, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}