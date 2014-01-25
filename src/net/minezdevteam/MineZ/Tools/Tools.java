package net.minezdevteam.MineZ.Tools;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Tools {
	public static void sendAdminHelp(CommandSender sender){
		sender.sendMessage("");
		sender.sendMessage(ChatColor.GRAY + "-= " + ChatColor.GREEN + "MineZ Help" + ChatColor.GRAY + " =-");
		sender.sendMessage(ChatColor.GRAY + "/mineza setspawn [count]");
		sender.sendMessage(ChatColor.GRAY + "/mineza setchest [type]");
		sender.sendMessage("");
		//TODO Complete help
	}

	public static void sendHelp(CommandSender sender){
		sender.sendMessage("");
		sender.sendMessage(ChatColor.GRAY + "-= " + ChatColor.GREEN + "MineZ Help" + ChatColor.GRAY + " =-");
		sender.sendMessage(ChatColor.GRAY + "/minez top");
		sender.sendMessage(ChatColor.GRAY + "/minez join");
		sender.sendMessage(ChatColor.GRAY + "/minez logout");
		sender.sendMessage(ChatColor.GRAY + "/minez stats");
		sender.sendMessage(ChatColor.GRAY + "/minez list");
		//TODO Complete help
	}
}
