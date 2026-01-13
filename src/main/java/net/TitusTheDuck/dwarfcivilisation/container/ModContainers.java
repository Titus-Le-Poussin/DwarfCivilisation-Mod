package net.TitusTheDuck.dwarfcivilisation.container;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModContainers {
    public static DeferredRegister<ContainerType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, DwarfCivilisationMod.MOD_ID);

    public static final RegistryObject<ContainerType<DwarfFurnaceContainer>> DWARF_FURNACE_CONTAINER
            = CONTAINERS.register("dwarf_furnace_container",() -> IForgeContainerType.create
            (((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new DwarfFurnaceContainer(windowId, world, pos, inv, inv.player);
            } )));

    public static final RegistryObject<ContainerType<DwarfWarriorContainer>> DWARF_WARRIOR_CONTAINER =
            CONTAINERS.register("dwarf_warrior_container",
                    () -> IForgeContainerType.create(DwarfWarriorContainer::new));

    public static final RegistryObject<ContainerType<DwarfHerboristContainer>> DWARF_HERBORIST_CONTAINER =
            CONTAINERS.register("dwarf_herborist_container",
                    () -> IForgeContainerType.create(DwarfHerboristContainer::new));

        public static void register(IEventBus eventBus) {
            CONTAINERS.register(eventBus);
        }
}
