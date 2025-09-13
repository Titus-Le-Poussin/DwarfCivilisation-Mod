package net.TitusTheDuck.dwarfcivilisation.item;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.item.custom.AutoSmeltPickaxeItem;
import net.TitusTheDuck.dwarfcivilisation.item.custom.HammerRunicItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DwarfCivilisationMod.MOD_ID);


        
                                //Tools

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModItemTier.STEEL, 6, 3f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));


        public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new net.minecraft.item.PickaxeItem(ModItemTier.STEEL, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));


        public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new net.minecraft.item.AxeItem(ModItemTier.STEEL, 5, -5.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

        
        public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new net.minecraft.item.ShovelItem(ModItemTier.STEEL, 1.5f, -3.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));



        public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new net.minecraft.item.HoeItem(ModItemTier.STEEL, -3, 0.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));



    public static final RegistryObject<Item> RUNIC_SWORD = ITEMS.register("runic_sword",
            () -> new SwordItem(ModItemTier.RUNIC, 6, 3f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));




    public static final RegistryObject<Item> RUNIC_PICKAXE = ITEMS.register("runic_pickaxe",
            () -> new AutoSmeltPickaxeItem(ModItemTier.RUNIC, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));


    public static final RegistryObject<Item> RUNIC_AXE = ITEMS.register("runic_axe",
            () -> new net.minecraft.item.AxeItem(ModItemTier.RUNIC, 6, -5.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));


    public static final RegistryObject<Item> RUNIC_SHOVEL = ITEMS.register("runic_shovel",
            () -> new net.minecraft.item.ShovelItem(ModItemTier.RUNIC, 1.5f, -3.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));



    public static final RegistryObject<Item> RUNIC_HOE = ITEMS.register("runic_hoe",
            () -> new net.minecraft.item.HoeItem(ModItemTier.RUNIC, -3, 0.0f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RUNIC_HAMMER = ITEMS.register("runic_hammer",
            () -> new HammerRunicItem(ModItemTier.RUNIC, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));





                                //Item


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> AZURE = ITEMS.register("azure",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_AZURE = ITEMS.register("raw_azure",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> STEEL_INGOTS = ITEMS.register("steel_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> MYTHRIL_INGOTS = ITEMS.register("mythril_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RENFORCED_STEEL_INGOTS = ITEMS.register("renforced_steel_ingots",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> CARBONE_POWDER = ITEMS.register("carbone_powder",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> EMBER_BRICK = ITEMS.register("ember_brick",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> PURITY_FRAGMENT = ITEMS.register("purity_fragment",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> PURITY_STICK = ITEMS.register("purity_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_EMBER = ITEMS.register("raw_ember",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_MYTHRIL = ITEMS.register("raw_mythril",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_ONYX = ITEMS.register("raw_onyx",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_ITEM_GROUP)));















    // bouffe

                            // Laitage

    public static final RegistryObject<Item> CAVERN_CHEESE_SLICE = ITEMS.register("cavern_cheese_slice",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.5F).build())));


    public static final RegistryObject<Item> CAVERN_CHEESE_WHEEL = ITEMS.register("cavern_cheese_wheel",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> CHEESE_PIE = ITEMS.register("cheese_pie",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(1F).build())));

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.5F).build())));

    public static final RegistryObject<Item> CHEESE_WHEEL = ITEMS.register("cheese_wheel",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> FERMENT_GOAT_MILK = ITEMS.register("ferment_goat_milk",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> FERMENT_MILK = ITEMS.register("ferment_milk",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> GOAT_CHEESE_SLICE = ITEMS.register("goat_cheese_slice",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.5F).build())));

    public static final RegistryObject<Item> GOAT_CHEESE_WHEEL = ITEMS.register("goat_cheese_wheel",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> GOAT_MILK = ITEMS.register("goat_milk",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));






                            //disches

    public static final RegistryObject<Item> CAVERN_CAKE = ITEMS.register("cavern_cake",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).meat().effect(()-> new EffectInstance
                            (Effects.LUCK, 20*1000, 0), 1).build())));

    public static final RegistryObject<Item> CINTER_STEW = ITEMS.register("cinter_stew",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).meat().build())));

    public static final RegistryObject<Item> CRISPY_POTATO_CAKE = ITEMS.register("crispy_potato_cake",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).meat().build())));

    public static final RegistryObject<Item> FERMENT_APPLE = ITEMS.register("ferment_apple",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.3F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> FERMENT_HONEY = ITEMS.register("ferment_honey",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.3F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> FERMENT_POTATO= ITEMS.register("ferment_potato",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.3F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> GOAT_PIE= ITEMS.register("goat_pie",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(1F).meat().build())));

    public static final RegistryObject<Item> HONEY_HAM= ITEMS.register("honey_ham",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).meat().build())));

    public static final RegistryObject<Item> HONEY_PIE= ITEMS.register("honey_pie",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> LIGHT_TART= ITEMS.register("light_tart",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NIGHT_VISION, 20*500, 1), 1).build())));

    public static final RegistryObject<Item> MINER_SOUP= ITEMS.register("miner_soup",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.INSTANT_HEALTH, 20*10, 0), 1).build())));

    public static final RegistryObject<Item> MINER_STEW= ITEMS.register("miner_stew",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(1F).effect(()-> new EffectInstance
                            (Effects.STRENGTH, 20*10, 0), 1).meat().build())));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(1).saturation(0.3F).effect(()-> new EffectInstance
                            (Effects.MINING_FATIGUE, 20*30, 0), 1).build())));

    public static final RegistryObject<Item> SMOKED_GOAT= ITEMS.register("smoked_goat",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(1F).meat().effect(()-> new EffectInstance
                            (Effects.FIRE_RESISTANCE, 20*400, 1), 1).build())));

    public static final RegistryObject<Item> LIGHT_MUSHROOM_SOUP= ITEMS.register("light_mushroom_soup",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NIGHT_VISION, 20*400, 1), 1).build())));

    public static final RegistryObject<Item> MUSH_BREAD= ITEMS.register("mush_bread",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));





                            //MEAT

    public static final RegistryObject<Item> COOKED_GOAT_MEAT= ITEMS.register("cooked_goat_meat",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(1F).meat().build())));

    public static final RegistryObject<Item> COOKED_HAM= ITEMS.register("cooked_ham",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(1F).meat().build())));

    public static final RegistryObject<Item> GOAT_MEAT= ITEMS.register("goat_meat",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));

    public static final RegistryObject<Item> HAM= ITEMS.register("ham",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));

    public static final RegistryObject<Item> SALT_HAM= ITEMS.register("salt_ham",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(4).saturation(0.5F).meat().build())));




                            //Mushroom

    public static final RegistryObject<Item> LIGHT_MUSHROOM= ITEMS.register("light_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.GLOWING, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> BIG_BROWN_MUSHROOM= ITEMS.register("big_brown_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).build())));

    public static final RegistryObject<Item> CINDERFUNGUS_MUSHROOM= ITEMS.register("cinderfungus_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> FERMENT_STONE_HAT_MUSHROOM= ITEMS.register("ferment_stone_hat_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.NAUSEA, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> FROSTPORE_MUSHROOM= ITEMS.register("frostpore_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.HASTE, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> LAVA_MUSHROOM= ITEMS.register("lava_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.FIRE_RESISTANCE, 20*30, 1), 1).build())));

    public static final RegistryObject<Item> STONE_HAT_MUSHROOM= ITEMS.register("stone_hat_mushroom",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(2).saturation(0.4F).effect(()-> new EffectInstance
                            (Effects.INSTANT_DAMAGE, 20, 1), 1).build())));









    //Liquide


    public static final RegistryObject<Item> LIGHTNING_BEER_PINT = ITEMS.register("lightning_beer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.NIGHT_VISION, 20*600, 2), 1).build())));

    public static final RegistryObject<Item> CAP_STONE_PINT = ITEMS.register("cap_stone_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.LUCK, 20*30, 0), 1).build())));

    public static final RegistryObject<Item> BUTTER_BEER_PINT = ITEMS.register("butter_beer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).build())));

    public static final RegistryObject<Item> DWARVEN_ALE_BOTTLE = ITEMS.register("dwarven_ale_bottle",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.STRENGTH, 20*300, 2), 1).build())));

    public static final RegistryObject<Item> DWARVEN_VODKA_PINT = ITEMS.register("dwarven_vodka_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.STRENGTH, 20*500, 2), 1).build())));

    public static final RegistryObject<Item> EMPTY_PINT = ITEMS.register("empty_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)));

    public static final RegistryObject<Item> FROSTPORE_PINT = ITEMS.register("frostpore_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.GLOWING, 20*500, 2), 1).build())));

    public static final RegistryObject<Item> GOAT_MILK_PINT = ITEMS.register("goat_milk_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(5).saturation(0.5F).build())));

    public static final RegistryObject<Item> HALLOWEER_PINT = ITEMS.register("halloweer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(0.8F).build())));

    public static final RegistryObject<Item> HYDROMEL_BOTTLE = ITEMS.register("hydromel_bottle",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(0.8F).effect(()-> new EffectInstance
                            (Effects.STRENGTH, 20*500, 2), 1).build())));

    public static final RegistryObject<Item> HYDROMEL_PINT = ITEMS.register("hydromel_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.5F).effect(()-> new EffectInstance
                            (Effects.STRENGTH, 20*300, 1), 1).build())));

    public static final RegistryObject<Item> MOLTEN_SPIRIT_BOTTLE = ITEMS.register("molten_spirit_bottle",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(0.8F).build())));


    public static final RegistryObject<Item> MUSH_BEER_PINT = ITEMS.register("mush_beer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(7).saturation(0.6F).build())));


    public static final RegistryObject<Item> POTATO_ALE_BOTTLE = ITEMS.register("potato_ale_bottle",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(8).saturation(0.8F).build())));


    public static final RegistryObject<Item> WHEAT_BEER_PINT = ITEMS.register("wheat_beer_pint",
            () -> new Item(new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_FOOD_GROUP)
                    .food(new Food.Builder().hunger(6).saturation(0.5F).build())));













    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
