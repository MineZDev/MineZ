package net.minezdevteam.MineZ.Tools;

import java.util.ArrayList;

import net.minezdevteam.MineZ.Main;
import net.minezdevteam.MineZ.Config.SpawnsConfig;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

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
	
	public static int getSpawnCount(Main m, FileConfiguration sc){
		// get all spawns from seperate spawns config
		ArrayList<String> keys = new ArrayList<String>();
        keys.addAll(sc.getKeys(false));
		return keys.size();
	}
	
	public static void setSpawn(Main m, Location l, SpawnsConfig sc){
		// TODO save location with yaw in seperate config
		FileConfiguration sc_ = sc.getConfig();
		String s = "spawn" + Integer.toString(getSpawnCount(m, sc_));
		sc_.set(s + ".world", l.getWorld().getName());
		sc_.set(s + ".x", l.getBlockX());
		sc_.set(s + ".y", l.getBlockY());
		sc_.set(s + ".z", l.getBlockZ());
		sc_.set(s + ".yaw", l.getYaw());
		sc_.set(s + ".pitch", l.getPitch());
		sc.saveConfig();
		
	}
	
	public static void joinGame(Main m, String player){
		
	}
	
	public static void leaveGame(Main m, String player){
		
	}

	public static void setChest(Main m, Location l, String type){
		
	}
}
