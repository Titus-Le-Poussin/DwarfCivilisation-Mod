package net.TitusTheDuck.dwarfcivilisation.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup DWARF_CIVILISATION_GROUP = new ItemGroup("dwarfcivilisationTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

}
