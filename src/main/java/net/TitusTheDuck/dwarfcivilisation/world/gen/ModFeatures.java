package net.TitusTheDuck.dwarfcivilisation.world.gen;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, "dwarfcivilisation");

    public static final RegistryObject<Feature<OreFeatureConfig>> EMBER_FEATURE =
            FEATURES.register("ember_block",
                    () -> new EmberFeature(OreFeatureConfig.CODEC));

    public static final RegistryObject<Feature<OreFeatureConfig>> ONYX_ARDOISE_FEATURE =
            FEATURES.register("onyx_ardoise_ore",
                    () -> new OnyxArdoiseFeature(OreFeatureConfig.CODEC));
}