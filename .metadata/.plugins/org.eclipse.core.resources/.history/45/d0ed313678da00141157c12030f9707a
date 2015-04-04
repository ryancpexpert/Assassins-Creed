package com.ryancpexpert.AssassinsCreed;

import java.util.Collections;
import java.util.List;

import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.util.command.CommandCallable;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandSource;

public class CommandACSetContract implements CommandCallable{

	public List<String> getSuggestions(CommandSource arg0, String arg1)
			throws CommandException {
		
		return Collections.emptyList();
	}

	public boolean call(CommandSource sender, String cmd, List<String> arg2)
			throws CommandException {
		if(cmd.toLowerCase() == "setcontract") {
			
		}
		return false;
	}

	public Text getHelp(CommandSource arg0) {
		
		return null;
	}

	public String getShortDescription(CommandSource arg0) {
		
		return "Creates a new contract for other players to accept.";
	}

	public String getUsage(CommandSource arg0) {
		
		return "/setbounty <player> <bounty>";
	}

	public boolean testPermission(CommandSource arg0) {
		
		return arg0.hasPermission("assassinscreed.contract.set");
	}

}
