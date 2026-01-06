package net.TitusTheDuck.dwarfcivilisation.events;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;
import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
//import net.TitusTheDuck.dwarfcivilisation.commands.ReturnHomeCommand;
//import net.TitusTheDuck.dwarfcivilisation.commands.SetHomeCommand;

@Mod.EventBusSubscriber(modid = DwarfCivilisationMod.MOD_ID)
public class ModEvents {

    /*@SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    } */

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getOriginal().getEntityWorld().isRemote()) {
            event.getPlayer().getPersistentData().putIntArray(DwarfCivilisationMod.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(DwarfCivilisationMod.MOD_ID + "homepos"));
        }
    }
}