package net.minezdevteam.MineZ.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class MechanicsListener implements Listener{

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
			if (!event.hasItem()) {
				return;
			}
			
			ItemStack lime = new MaterialData(Material.INK_SACK, (byte) 10).toItemStack();
			ItemStack red = new MaterialData(Material.INK_SACK, (byte) 1).toItemStack();
			
			if(event.getItem().getType() == Material.SUGAR){
				// speed boost
			}else if(event.getItem().getType() == Material.MILK_BUCKET){
				// milk against zombie disease
			}else if(event.getItem().getType() == Material.POTION){
				// water bottle for drinking
			}else if(event.getItem().getType() == Material.PAPER){
				// bandage
			}else if(event.getItem().equals(lime)){
				// lime dye
			}else if(event.getItem().equals(red)){
				// red dye
			}
		}
	}
	
}
