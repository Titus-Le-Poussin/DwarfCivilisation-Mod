package net.TitusTheDuck.dwarfcivilisation.events;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfSentinelEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfBarmanEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.ModEntityTypes;
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

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}