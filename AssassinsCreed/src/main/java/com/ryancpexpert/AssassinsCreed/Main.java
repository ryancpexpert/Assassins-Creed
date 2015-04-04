package com.ryancpexpert.AssassinsCreed;

import org.spongepowered.api.Game;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.event.entity.EntityTargetEntityEvent;
import org.spongepowered.api.event.entity.player.PlayerChangeBlockEvent;
import org.spongepowered.api.event.entity.player.PlayerJoinEvent;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.util.event.Subscribe;
import org.spongepowered.api.world.World;

@Plugin(id = "AssassinsCreedPlugin", name = "AssassinsCreed", version = "1.0", dependencies = "")
public class Main {
	Game game;
	World world;
	
	@Subscribe
	public void onPreInitialization(PreInitializationEvent event) {
		game = event.getGame();
		
	}
	
	@Subscribe
	public void onStop(ServerStoppingEvent event) {
		
	}
	
	
	@Subscribe
	public void onServerStarting(ServerStartingEvent event) {
		
	}
	
	@Subscribe
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		//Should handle welcome messages for new players
		if(player.hasJoinedBefore() == false) {
			player.sendMessage(Texts.of(TextColors.AQUA + "Welcome to the Animus! For a quick explanation of the server, use /shelp."));
		}
	}
	//Handles attacking
	@Subscribe
	public void onPlayerAttack(EntityTargetEntityEvent event) {
		Entity attacker = event.getEntity();
		
		if(event.getTargetedEntity() instanceof Player && attacker instanceof Player) {
			//TODO: Work on assassination
		}
	}
	
	@Subscribe
	public void onBlockBreak(PlayerChangeBlockEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPermission("build")) {
			event.setCancelled(true);
			player.sendMessage(Texts.of(TextColors.RED + "Breaking blocks is prohibitted in the Animus!"));
		}
	}
}
	
