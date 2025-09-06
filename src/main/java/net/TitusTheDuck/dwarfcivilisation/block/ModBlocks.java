package net.TitusTheDuck.dwarfcivilisation.block;

import net.TitusTheDuck.dwarfcivilisation.item.ModItemGroup;
import net.TitusTheDuck.dwarfcivilisation.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.TitusTheDuck.dwarfcivilisation.block.custom.DwarfFurnaceBlock;


import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DwarfCivilisationMod.MOD_ID);




                        //special block

        public static final RegistryObject<Block> DWARF_FURNACE = registerBlock("dwarf_furnace",
                () -> new DwarfFurnaceBlock(AbstractBlock.Properties
                        .create(Material.IRON)
                        .harvestLevel(2)
                        .harvestTool(ToolType.PICKAXE).setRequiresTool()
                        .hardnessAndResistance(5f)));





                            //Precieux

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

    public static final RegistryObject<Block> MYTHRIL_ORE = registerBlock("mythril_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(7f)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(6f)));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> ONYX_BLOCK = registerBlock("onyx_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> PURITY_ORE = registerBlock("purity_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

     public static final RegistryObject<Block> SILVER_STAIRS = registerBlock("silver_stairs",
             () -> new StairsBlock(() -> SILVER_BLOCK.get().getDefaultState(), AbstractBlock.Properties
                     .create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE)
                     .setRequiresTool()));

    public static final RegistryObject<Block>SILVER_SLAB = registerBlock("silver_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
            .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(6f)));






    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> SILVER_PILLAR = registerBlock("silver_pillar",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));


    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));











    //ardoise

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

    public static final RegistryObject<Block> ONYX_ARDOISE_BRICK = registerBlock("onyx_ardoise_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> ONYX_ARDOISE_ORE = registerBlock("onyx_ardoise_ore",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f)));


                         public static final RegistryObject<Block> ARDOISE_BLOCK_STAIRS = registerBlock("ardoise_block_stairs",
             () -> new StairsBlock(() -> ARDOISE_BLOCK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));


                         public static final RegistryObject<Block> ARDOISE_BRICK_STAIRS = registerBlock("ardoise_brick_stairs",
             () -> new StairsBlock(() -> ARDOISE_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));


                        public static final RegistryObject<Block> ARDOISE_CUBE_STAIRS = registerBlock("ardoise_cube_stairs",
             () -> new StairsBlock(() -> ARDOISE_CUBE.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

        public static final RegistryObject<Block>ARDOISE_BLOCK_SLAB = registerBlock("ardoise_block_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>ARDOISE_BRICK_SLAB = registerBlock("ardoise_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>ARDOISE_CUBE_SLAB = registerBlock("ardoise_cube_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));






    //dwarf brique

    public static final RegistryObject<Block> DWARF_BRICK = registerBlock("dwarf_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> IRON_DWARF_BRICK = registerBlock("iron_dwarf_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> GOLD_DWARF_BRICK = registerBlock("gold_dwarf_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> DIAMOND_DWARF_BRICK = registerBlock("diamond_dwarf_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(6f)));

    public static final RegistryObject<Block> RUBY_DWARF_BRICK = registerBlock("ruby_dwarf_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(6f)));


                        public static final RegistryObject<Block> DWARF_BRICK_STAIRS = registerBlock("dwarf_brick_stairs",
             () -> new StairsBlock(() -> DWARF_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> IRON_DWARF_BRICK_STAIRS = registerBlock("iron_dwarf_brick_stairs",
             () -> new StairsBlock(() -> IRON_DWARF_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> GOLD_DWARF_BRICK_STAIRS = registerBlock("gold_dwarf_brick_stairs",
             () -> new StairsBlock(() -> GOLD_DWARF_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> DIAMOND_DWARF_BRICK_STAIRS = registerBlock("diamond_dwarf_brick_stairs",
             () -> new StairsBlock(() -> DIAMOND_DWARF_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block>IRON_DWARF_BRICK_SLAB = registerBlock("iron_dwarf_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5f)));

                   public static final RegistryObject<Block>GOLD_DWARF_BRICK_SLAB = registerBlock("gold_dwarf_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5f)));

                   public static final RegistryObject<Block>DIAMOND_DWARF_BRICK_SLAB = registerBlock("diamond_dwarf_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(6f)));

                         public static final RegistryObject<Block>DWARF_BRICK_SLAB = registerBlock("dwarf_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));






                    //Schist

    public static final RegistryObject<Block> SCHIST_BLOCK = registerBlock("schist_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> CARBONE_SCHIST_BLOCK = registerBlock("carbone_schist_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> CARBONE_SCHIST_BRICK = registerBlock("carbone_schist_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SMOOTH_CARBONE_SCHIST_BRICK = registerBlock("smooth_carbone_schist_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

                    public static final RegistryObject<Block> CARBONE_SCHIST_BRICK_STAIRS = registerBlock("carbone_schist_brick_stairs",
             () -> new StairsBlock(() -> CARBONE_SCHIST_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));


             public static final RegistryObject<Block> CARBONE_SCHIST_BLOCK_STAIRS = registerBlock("carbone_schist_block_stairs",
             () -> new StairsBlock(() -> CARBONE_SCHIST_BLOCK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> SMOOTH_CARBONE_SCHIST_BRICK_STAIRS = registerBlock("smooth_carbone_schist_brick_stairs",
             () -> new StairsBlock(() -> SMOOTH_CARBONE_SCHIST_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));



        public static final RegistryObject<Block>SCHIST_BLOCK_SLAB = registerBlock("schist_block_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));


        public static final RegistryObject<Block>CARBONE_SCHIST_BLOCK_SLAB = registerBlock("carbone_schist_block_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));


        public static final RegistryObject<Block>CARBONE_SCHIST_BRICK_SLAB = registerBlock("carbone_schist_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));


        public static final RegistryObject<Block>SMOOTH_CARBONE_SCHIST_BRICK_SLAB = registerBlock("smooth_carbone_schist_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));









    //Ember

    public static final RegistryObject<Block> CRACKED_EMBER_BRICKS = registerBlock("cracked_ember_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));


    public static final RegistryObject<Block> EMBER_BLOCK = registerBlock("ember_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));


    public static final RegistryObject<Block> EMBER_BRICKS = registerBlock("ember_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> EMBER_PILLAR = registerBlock("ember_pillar",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> MOSSY_EMBER_BRICKS = registerBlock("mossy_ember_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SILVEMBER_BRICK = registerBlock("silvember_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SMOOTH_EMBER_BRICKS = registerBlock("smooth_ember_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SMOOTH_EMBER_PILLAR = registerBlock("smooth_ember_pillar",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));


                    public static final RegistryObject<Block> CRACKED_EMBER_BRICKS_STAIRS = registerBlock("cracked_ember_bricks_stairs",
             () -> new StairsBlock(() -> CRACKED_EMBER_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> EMBER_BRICKS_STAIRS = registerBlock("ember_bricks_stairs",
             () -> new StairsBlock(() -> EMBER_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> EMBER_BLOCK_STAIRS = registerBlock("ember_block_stairs",
             () -> new StairsBlock(() -> EMBER_BLOCK.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> SILVEMBER_BRICK_STAIRS = registerBlock("silvember_brick_stairs",
             () -> new StairsBlock(() -> SILVEMBER_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

             public static final RegistryObject<Block> SMOOTH_EMBER_BRICKS_STAIRS = registerBlock("smooth_ember_bricks_stairs",
             () -> new StairsBlock(() -> SMOOTH_EMBER_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

    public static final RegistryObject<Block> MOSSY_EMBER_BRICKS_STAIRS = registerBlock("mossy_ember_bricks_stairs",
            () -> new StairsBlock(() -> MOSSY_EMBER_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));


        public static final RegistryObject<Block>EMBER_BLOCK_SLAB = registerBlock("ember_block_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>EMBER_BRICKS_SLAB = registerBlock("ember_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>CRACKED_EMBER_BRICKS_SLAB = registerBlock("cracked_ember_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));
        
        public static final RegistryObject<Block>SILVEMBER_BRICK_SLAB = registerBlock("silvember_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4f)));

        public static final RegistryObject<Block>SMOOTH_EMBER_BRICKS_SLAB = registerBlock("smooth_ember_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>MOSSY_EMBER_BRICKS_SLAB = registerBlock("mossy_ember_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        

        






    // SUNSTONE

    public static final RegistryObject<Block> SUNSTONE_BLOCK = registerBlock("sunstone_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SUNSTONE_BRICK = registerBlock("sunstone_brick",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SUNSTONE_PILLAR = registerBlock("sunstone_pillar",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SUNSTONE_PURITY_SCULT = registerBlock("sunstone_purity_sculpt",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SUNSTONE_TOPAZ_BRICKS = registerBlock("sunstone_topaz_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> MOSSY_SUNSTONE_BRICKS = registerBlock("mossy_sunstone_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> SMOOTH_SUNSTONE_BRICKS = registerBlock("smooth_sunstone_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));



                public static final RegistryObject<Block> SMOOTH_SUNSTONE_BRICKS_STAIRS = registerBlock("smooth_sunstone_bricks_stairs",
             () -> new StairsBlock(() -> SMOOTH_SUNSTONE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

                public static final RegistryObject<Block> SUNSTONE_BRICK_STAIRS = registerBlock("sunstone_brick_stairs",
             () -> new StairsBlock(() -> SUNSTONE_BRICK.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

                public static final RegistryObject<Block> SUNSTONE_BLOCK_STAIRS = registerBlock("sunstone_block_stairs",
             () -> new StairsBlock(() -> SUNSTONE_BLOCK.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

                public static final RegistryObject<Block> MOSSY_SUNSTONE_BRICKS_STAIRS = registerBlock("mossy_sunstone_bricks_stairs",
            () -> new StairsBlock(() -> MOSSY_SUNSTONE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

                public static final RegistryObject<Block> SUNSTONE_TOPAZ_BRICKS_STAIRS = registerBlock("sunstone_topaz_bricks_stairs",
            () -> new StairsBlock(() -> SUNSTONE_TOPAZ_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));

public static final RegistryObject<Block>SUNSTONE_BLOCK_SLAB = registerBlock("sunstone_block_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));


        public static final RegistryObject<Block>SUNSTONE_BRICK_SLAB = registerBlock("sunstone_brick_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>MOSSY_SUNSTONE_BRICKS_SLAB = registerBlock("mossy_sunstone_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>SMOOTH_SUNSTONE_BRICKS_SLAB = registerBlock("smooth_sunstone_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));

        public static final RegistryObject<Block>SUNSTONE_TOPAZ_BRICKS_SLAB = registerBlock("sunstone_topaz_bricks_slab",
            () ->new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5f)));

        





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);


        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.DWARF_CIVILISATION_BLOCK_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
