package com.ryancpexpert.AssassinsCreed;

import java.util.Collections;
import java.util.List;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.util.command.CommandCallable;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandSource;

public class CommandACSHelp implements CommandCallable{

	public List<String> getSuggestions(CommandSource arg0, String arg1)
			throws CommandException {
		
		return Collections.emptyList();
	}

	public boolean call(CommandSource sender, String cmd, List<String> arg2)
			throws CommandException {
		if(cmd.toLowerCase() == "shelp") {
			sender.sendMessage(Texts.of(TextColors.BLUE + "This server is an Assassins' Creed themed server."));
			sender.sendMessage(Texts.of(TextColors.BLUE + "We are currently working on a system for contracts and assassinations,"));
			sender.sendMessage(Texts.of(TextColors.BLUE + "as well as missions, so just be patient. You can gain money by killing"));
			sender.sendMessage(Texts.of(TextColors.BLUE + "other players, and use that money to buy weapons and better armor."));
			return true;
		}
		return false;
	}

	public Text getHelp(CommandSource sender) {
		
		return Texts.of("Type /shelp for a brief explanation of the server.");
	}

	public String getShortDescription(CommandSource sender) {
		
		return "Basic information about the server.";
	}

	public String getUsage(CommandSource sender) {
		
		return "/shelp";
	}

	public boolean testPermission(CommandSource sender) {
		
		return sender.hasPermission("assassinscreed.server.help");
	}

}
