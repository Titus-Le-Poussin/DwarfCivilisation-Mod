package net.TitusTheDuck.dwarfcivilisation.entity.custom;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, DwarfCivilisationMod.MOD_ID);

    public static final RegistryObject <EntityType<DwarfWarriorEntity>> DWARF_WARRIOR =
            ENTITY_TYPES.register("dwarf_warrior", () -> EntityType.Builder.create(DwarfWarriorEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_warrior")
                            .toString()));

    public static final RegistryObject <EntityType<DwarfSentinelEntity>> DWARF_SENTINEL =
            ENTITY_TYPES.register("dwarf_sentinel", () -> EntityType.Builder.create(DwarfSentinelEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_sentinel")
                            .toString()));

    public static final RegistryObject <EntityType<DwarfBarmanEntity>> DWARF_BARMAN =
            ENTITY_TYPES.register("dwarf_barman", () -> EntityType.Builder.create(DwarfBarmanEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_barman")
                            .toString()));


    public static final RegistryObject <EntityType<DwarfForgerEntity>> DWARF_FORGER =
            ENTITY_TYPES.register("dwarf_forger", () -> EntityType.Builder.create(DwarfForgerEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_forger")
                            .toString()));

    public static final RegistryObject <EntityType<DwarfHerboristEntity>> DWARF_HERBORIST =
            ENTITY_TYPES.register("dwarf_herborist", () -> EntityType.Builder.create(DwarfHerboristEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_herborist")
                            .toString()));

    public static final RegistryObject <EntityType<DwarfBerserkEntity>> DWARF_BERSERK =
            ENTITY_TYPES.register("dwarf_berserk", () -> EntityType.Builder.create(DwarfBerserkEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_berserk")
                            .toString()));

    public static final RegistryObject <EntityType<DwarfAlchemistEntity>> DWARF_ALCHEMIST =
            ENTITY_TYPES.register("dwarf_alchemist", () -> EntityType.Builder.create(DwarfAlchemistEntity::new, EntityClassification.CREATURE)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "dwarf_alchemist")
                            .toString()));




    public static final RegistryObject <EntityType<KoboldEntity>> KOBOLD_SIMPLE =
            ENTITY_TYPES.register("simple_kobold", () -> EntityType.Builder.create(KoboldEntity::new, EntityClassification.MONSTER)
                    .size(1f, 2f)
                    .build(new ResourceLocation(DwarfCivilisationMod.MOD_ID, "simple_kobold")
                            .toString()));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
