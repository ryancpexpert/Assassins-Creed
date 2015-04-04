package com.ryancpexpert.AssassinsCreed;

import java.util.Collections;
import java.util.List;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.text.format.TextColors;
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
			sender.sendMessage(Texts.of(TextColors.GREEN + "This command is a WIP, please be patient :)."));
		}
		return false;
	}

	public Text getHelp(CommandSource sender) {
		
		return null;
	}

	public String getShortDescription(CommandSource sender) {
		
		return "Creates a new contract for other players to accept.";
	}

	public String getUsage(CommandSource sender) {
		
		return "/setbounty <player> <bounty>";
	}

	public boolean testPermission(CommandSource sender) {
		
		return sender.hasPermission("assassinscreed.contract.set");
	}

}
