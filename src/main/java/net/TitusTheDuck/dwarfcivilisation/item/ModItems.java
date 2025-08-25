package net.TitusTheDuck.dwarfcivilisation.item;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DwarfCivilisationMod.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> AZURE = ITEMS.register("azure",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> RAW_AZURE = ITEMS.register("raw_azure",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> STEEL_INGOTS = ITEMS.register("steel_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> MYTHRIL_INGOTS = ITEMS.register("mythril_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static final RegistryObject<Item> RENFORCED_STEEL_INGOTS = ITEMS.register("renforced_steel_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
