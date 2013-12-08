package me.brawl.Main;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class Main extends JavaPlugin {
	
	public void launchPlayer(Player player) {
		Vector vector = player.getEyeLocation().getDirection();
		vector.multiply(1.0F);
		vector.setY(2.0);
		player.setVelocity(vector);
	}
	
	public void onEnable() {
	
	}

	public void onDisable() {
		
	}

}
