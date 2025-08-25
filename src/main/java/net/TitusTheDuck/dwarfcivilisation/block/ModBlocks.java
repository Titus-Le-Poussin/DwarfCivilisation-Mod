package net.TitusTheDuck.dwarfcivilisation.block;

import net.TitusTheDuck.dwarfcivilisation.item.ModItemGroup;
import net.TitusTheDuck.dwarfcivilisation.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DwarfCivilisationMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AZURE_ORE = registerBlock("azure_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> SCULPT_ARDOISE = registerBlock("sculpt_ardoise",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> ARDOISE_BLOCK = registerBlock("ardoise_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> ARDOISE_BRICK = registerBlock("ardoise_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> ARDOISE_CUBE = registerBlock("ardoise_cube",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> ARDOISE_PILLAR = registerBlock("ardoise_pillar",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);


        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
