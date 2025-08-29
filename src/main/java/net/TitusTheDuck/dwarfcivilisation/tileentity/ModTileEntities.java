package net.TitusTheDuck.dwarfcivilisation.tileentity;


import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, DwarfCivilisationMod.MOD_ID);

    public static RegistryObject<TileEntityType<DwarfFurnaceTileEntity>> DWARF_FURNACE_TILE =
        TILE_ENTITIES.register("dwarf_furnace_tile", () -> TileEntityType.Builder.create
                (DwarfFurnaceTileEntity::new, ModBlocks.DWARF_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }

}
