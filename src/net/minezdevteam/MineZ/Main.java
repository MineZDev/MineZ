package net.minezdevteam.MineZ;

import net.minezdevteam.MineZ.Commands.MainAdminCommand;
import net.minezdevteam.MineZ.Commands.MainCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	
	public void onEnable(){
		// init config
		getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		// init commands
		getCommand("minez").setExecutor(new MainCommand(this));
		getCommand("mineza").setExecutor(new MainAdminCommand(this));
		
		// init listener

	}
	
	public void onDisable(){
		
	}
	
}
