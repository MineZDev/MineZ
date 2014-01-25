package net.minezdevteam.MineZ;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable(){
		// init config
		getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		// init commands
		
		// init listener

	}
	
	public void onDisable(){
		
	}
	
}
