package net.TitusTheDuck.dwarfcivilisation.events;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.*;
import net.TitusTheDuck.dwarfcivilisation.item.custom.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = DwarfCivilisationMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.DWARF_WARRIOR.get(), DwarfWarriorEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_SENTINEL.get(), DwarfSentinelEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_BARMAN.get(), DwarfBarmanEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.KOBOLD_SIMPLE.get(), KoboldEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_HERBORIST.get(), DwarfHerboristEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_BERSERK.get(), DwarfBerserkEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_FORGER.get(), DwarfForgerEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DWARF_ALCHEMIST.get(), DwarfAlchemistEntity.setCustomAttributes().create());

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}