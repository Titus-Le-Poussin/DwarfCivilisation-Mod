package net.TitusTheDuck.dwarfcivilisation.events;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.NetworkHooks;
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
    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof DwarfWarriorEntity) {
            DwarfWarriorEntity warrior = (DwarfWarriorEntity) event.getTarget();
            PlayerEntity player = event.getPlayer();
            Hand hand = event.getHand();

            if (!event.getWorld().isRemote() && player instanceof ServerPlayerEntity) {
                // Ouvre l'interface
                NetworkHooks.openGui((ServerPlayerEntity) player,
                        warrior.new DwarfWarriorContainerProvider(warrior),
                        buf -> buf.writeInt(warrior.getEntityId()));

                event.setCanceled(true);
                event.setCancellationResult(ActionResultType.SUCCESS);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getOriginal().getEntityWorld().isRemote()) {
            event.getPlayer().getPersistentData().putIntArray(DwarfCivilisationMod.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(DwarfCivilisationMod.MOD_ID + "homepos"));
        }
    }
}