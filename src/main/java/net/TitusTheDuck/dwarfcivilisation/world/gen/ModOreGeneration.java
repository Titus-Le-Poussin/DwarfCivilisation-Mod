package net.TitusTheDuck.dwarfcivilisation.world.gen;

import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            if (ore == OreType.AZURE && event.getCategory() != Biome.Category.OCEAN) {
                continue;
            }
            if ((ore == OreType.TOPAZ || ore == OreType.SUNSTONE)
                    && event.getCategory() != Biome.Category.DESERT) {
                continue;
            }
            if (ore == OreType.EMBER) {
                generateEmberOre(event);
            }
            if (ore == OreType.ONYX_ARDOISE) {
                generateOnyxArdoiseOre(event);
            }

            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ore.getBlock().get().getDefaultState(),
                    ore.getMaxveinSize()
            );

            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            ore.getMinHeight(),
                            ore.getMinHeight(),
                            ore.getMaxHeight()
                    )
            );

            ConfiguredFeature<?, ?> oreFeature =
                    registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

            event.getGeneration()
                    .withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }


    }


    private static ConfiguredFeature<?, ?> registerOreFeature(
            OreType ore,
            OreFeatureConfig oreFeatureConfig,
            ConfiguredPlacement<?> configuredPlacement
    ) {

        return Registry.register(
                WorldGenRegistries.CONFIGURED_FEATURE,
                ore.getBlock().get().getRegistryName(),
                Feature.ORE
                        .withConfiguration(oreFeatureConfig)
                        .withPlacement(configuredPlacement)
                        .square()
                        .count(ore.getVeinsPerChunk())
        );
    }






    private static void generateEmberOre(final BiomeLoadingEvent event) {
        BlockMatchRuleTest emberTarget = new BlockMatchRuleTest(ModBlocks.EMBER_BLOCK.get());

        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                emberTarget,
                ModBlocks.EMBER_BLOCK.get().getDefaultState(),
                3
        );


        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                new TopSolidRangeConfig(1, 1, 30)
        );

        ConfiguredFeature<?, ?> oreFeature = Feature.ORE
                .withConfiguration(oreFeatureConfig)
                .withPlacement(configuredPlacement)
                .square()
                .count(6);


        event.getGeneration()
                .withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
    }


    private static void generateOnyxArdoiseOre(final BiomeLoadingEvent event) {
        BlockMatchRuleTest ardoiseTarget = new BlockMatchRuleTest(ModBlocks.ARDOISE_CUBE.get());

        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                ardoiseTarget,
                ModBlocks.ONYX_ARDOISE_ORE.get().getDefaultState(),
                4
        );

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                new TopSolidRangeConfig(0, 0, 20)
        );

        ConfiguredFeature<?, ?> oreFeature = Feature.ORE
                .withConfiguration(oreFeatureConfig)
                .withPlacement(configuredPlacement)
                .square()
                .count(3);

        event.getGeneration()
                .withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
    }
}

