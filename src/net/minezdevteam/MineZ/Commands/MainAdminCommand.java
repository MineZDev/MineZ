package net.minezdevteam.MineZ.Commands;

import net.minezdevteam.MineZ.Main;
import net.minezdevteam.MineZ.Tools.Tools;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainAdminCommand implements CommandExecutor {

	private Main plugin;
	 
	public MainAdminCommand(Main plugin) {
		this.plugin = plugin;
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
					
					// admin commands
					if(action.equalsIgnoreCase("help")){
						Tools.sendAdminHelp(sender);
					}else if(action.equalsIgnoreCase("enable")){
						// enable a game
					}else if(action.equalsIgnoreCase("disable")){
						// disable and stop a game
					}else if(action.equalsIgnoreCase("setspawn")){
						// set a new spawn point
						
					}else if(action.equalsIgnoreCase("setchest")){
						// set a new chest
						if(args.length > 1){
							String type = args[1];
							
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
