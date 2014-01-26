package net.minezdevteam.MineZ.Commands;

import net.minezdevteam.MineZ.Main;
import net.minezdevteam.MineZ.Config.SpawnsConfig;
import net.minezdevteam.MineZ.Tools.Tools;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class MainAdminCommand implements CommandExecutor {

	private Main plugin;
	private SpawnsConfig spawnsConfig = null;
	 
	public MainAdminCommand(Main plugin) {
		this.plugin = plugin;
		this.spawnsConfig = new SpawnsConfig(plugin);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("mineza") || cmd.getName().equalsIgnoreCase("mza")){
			if(sender.hasPermission(plugin.getName() + ".admin")){
				if(args.length > 0){
					String action = args[0];
					if(!(sender instanceof Player)){
						return true;
					}
					
					Player p = (Player)sender;
					
					// admin commands
					if(action.equalsIgnoreCase("help")){
						Tools.sendAdminHelp(sender);
					}else if(action.equalsIgnoreCase("enable")){
						// enable a game
					}else if (action.equalsIgnoreCase("tutvill")){
						 LivingEntity ent = p.getWorld().spawnCreature(p.getLocation(), EntityType.VILLAGER);
                         ent.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "MineZ Tutorial");
                         ent.setCustomNameVisible(true);
                        //Spawns a Tutorial Villager (Doesn't work yet)
					}else if(action.equalsIgnoreCase("disable")){
						// disable and stop a game
					}else if(action.equalsIgnoreCase("setspawn")){
						// set a new spawn point
						Tools.setSpawn(plugin, p.getLocation(), spawnsConfig);
					}else if(action.equalsIgnoreCase("setchest")){
						// set a new chest
						if(args.length > 1){
							String type = args[1];
							Tools.setChest(plugin, p.getLocation(), type);
						}else{
							Tools.sendAdminHelp(sender);
						}
					}else if(action.equalsIgnoreCase("start")){
						// start the game
					}else if(action.equalsIgnoreCase("stop")){
						// stop the game
					}else if(action.equalsIgnoreCase("refill")){
						// refill all chests
					}else if(action.equalsIgnoreCase("listspawns")){
						// lists all registered spawns
					}else if(action.equalsIgnoreCase("listchests")){
						// lists all registered chests
					}
					
				}else{
					Tools.sendAdminHelp(sender);
				}
			}
		}
		return false;
	}
	
	
	

}
