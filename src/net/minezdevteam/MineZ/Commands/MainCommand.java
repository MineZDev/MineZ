package net.minezdevteam.MineZ.Commands;

import net.minezdevteam.MineZ.Main;
import net.minezdevteam.MineZ.Tools.Tools;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {

	private Main plugin;
	 
	public MainCommand(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("minez") || cmd.getName().equalsIgnoreCase("mz")){
			if(sender.hasPermission(plugin.getName() + ".user")){
				if(args.length > 0){
					String action = args[0];
					if(!(sender instanceof Player)){
						return true;
					}
					
					// user commands
					if(action.equalsIgnoreCase("help")){
						Tools.sendHelp(sender);
					}else if(action.equalsIgnoreCase("join")){
						// joins the game (must be on the server already, this is for new users logging on)
					}else if(action.equalsIgnoreCase("logout")){
						// logs out safely
					}else if(action.equalsIgnoreCase("top")){
						// top scores
					}else if(action.equalsIgnoreCase("stats")){
						// own stats
					}
					
				}else{
					Tools.sendHelp(sender);
				}
			}
		}
		return false;
	}
	
	

}
