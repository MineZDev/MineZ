package net.minezdevteam.MineZ.Commands;

import net.minezdevteam.MineZ.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {

	private Main plugin;
	 
	public MainCommand(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("minez")){
			if(args.length > 0){
				String action = args[0];
			}else{
				// show help
			}
		}
		return false;
	}

}
