package net.minezdevteam.MineZ.Tools;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Tools {
	public static void sendAdminHelp(CommandSender sender){
		sender.sendMessage("");
		sender.sendMessage(ChatColor.DARK_AQUA + "-= " + ChatColor.GOLD + "MineZ Help" + ChatColor.DARK_AQUA + " =-");
		sender.sendMessage(ChatColor.DARK_AQUA + "/mineza setspawn [count]");
		sender.sendMessage(ChatColor.DARK_AQUA + "/mineza setchest [type]");
		sender.sendMessage("");
		//TODO Complete help
	}

	public static void sendHelp(CommandSender sender){
		sender.sendMessage("");
		sender.sendMessage(ChatColor.DARK_AQUA + "-= " + ChatColor.GOLD + "MineZ Help" + ChatColor.DARK_AQUA + " =-");
		sender.sendMessage(ChatColor.DARK_AQUA + "/minez top");
		sender.sendMessage(ChatColor.DARK_AQUA + "/minez join");
		sender.sendMessage(ChatColor.DARK_AQUA + "/minez logout");
		sender.sendMessage(ChatColor.DARK_AQUA + "/minez stats");
		sender.sendMessage(ChatColor.DARK_AQUA + "/minez list");
		//TODO Complete help
	}
}
