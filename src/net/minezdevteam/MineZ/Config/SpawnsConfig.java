package net.minezdevteam.MineZ.Config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import net.minezdevteam.MineZ.Main;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class SpawnsConfig {

    private FileConfiguration spawnsConfig = null;
    private File spawnsFile = null;
    private Main m = null;
    
    public SpawnsConfig(Main m){
    	this.m = m;
    }
    
    public FileConfiguration getConfig() {
        if (spawnsConfig == null) {
            reloadConfig();
        }
        return spawnsConfig;
    }
    
    public void saveConfig() {
        if (spawnsConfig == null || spawnsFile == null) {
            return;
        }
        try {
            getConfig().save(spawnsFile);
        } catch (IOException ex) {
            
        }
    }
    
    public void reloadConfig() {
        if (spawnsFile == null) {
        	spawnsFile = new File(m.getDataFolder(), "spawns.yml");
        }
        spawnsConfig = YamlConfiguration.loadConfiguration(spawnsFile);

        InputStream defConfigStream = m.getResource("spawns.yml");
        if (defConfigStream != null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            spawnsConfig.setDefaults(defConfig);
        }
    }
}
