package net.TitusTheDuck.dwarfcivilisation.item;

import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup DWARF_CIVILISATION_BLOCK_GROUP = new ItemGroup("DwarfBlockTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModBlocks.DWARF_BRICK.get());
        }
    };

    public static final ItemGroup DWARF_CIVILISATION_FOOD_GROUP = new ItemGroup("DwarfFoodTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.HYDROMEL_PINT.get());
        }
    };

    public static final ItemGroup DWARF_CIVILISATION_ITEM_GROUP = new ItemGroup("DwarfItemTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

}
