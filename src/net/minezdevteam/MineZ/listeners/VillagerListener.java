package net.minezdevteam.MineZ.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.Plugin;

public class VillagerListener implements Listener {

	// I added this part from another plugin i've made, so not sure if this works.
	
	
	  @EventHandler
	  public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) { Entity entity = event.getRightClicked();
	    if (!(entity instanceof NPC))
	      return;
	    final Player p = event.getPlayer();
	    event.setCancelled(true);
	    Bukkit.getServer().getScheduler().runTaskLater((Plugin) this, new Runnable(){
	        public void run(){
	         p.sendMessage(ChatColor.GRAY + "0o==================" + ChatColor.GREEN + ChatColor.BOLD + "MineZ" + ChatColor.GRAY + "==================o0");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "Welcome to MineZ");
	         p.sendMessage(ChatColor.GREEN + "This is a quick tutorial about the gamemode");
	         p.sendMessage(ChatColor.GREEN + "Let's get started!");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GRAY + "0o=================================================o0");
	        }
	       }, 200);
	       Bukkit.getServer().getScheduler().runTaskLater((Plugin) this, new Runnable(){
	        public void run(){
	         p.sendMessage(ChatColor.GRAY + "0o===============" + ChatColor.GREEN + ChatColor.BOLD + "Gameplay" + ChatColor.GRAY + "==============o0");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");// Add message here
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GREEN + "");
	         p.sendMessage(ChatColor.GRAY + "0o=================================================o0");
	        }
	       }, 400);
	       
	  }
	
}
