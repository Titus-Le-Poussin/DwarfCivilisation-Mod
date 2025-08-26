package net.TitusTheDuck.dwarfcivilisation.item;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
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


    // bouffe

                            // Laitage

    public static final RegistryObject<Item> CAVERN_CHEESE_SLICE = ITEMS.register("cavern_cheese_slice",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.5F).build())));


    public static final RegistryObject<Item> CAVERN_CHEESE_WHEEL = ITEMS.register("cavern_cheese_wheel",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> CHEESE_PIE = ITEMS.register("cheese_pie",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(1F).build())));

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.5F).build())));

    public static final RegistryObject<Item> CHEESE_WHEEL = ITEMS.register("cheese_wheel",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> FERMENT_GOAT_MILK = ITEMS.register("ferment_goat_milk",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));






                            //Liquide


    public static final RegistryObject<Item> LIGHTNING_BEER_PINT = ITEMS.register("lightning_beer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NIGHT_VISION, 20*30, 0), 1).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
