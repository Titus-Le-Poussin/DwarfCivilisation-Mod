package net.TitusTheDuck.dwarfcivilisation.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup DWARF_CIVILISATION_BLOCK_GROUP = new ItemGroup("DwarfBlockTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final ItemGroup DWARF_CIVILISATION_FOOD_GROUP = new ItemGroup("DwarfFoodTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

}
