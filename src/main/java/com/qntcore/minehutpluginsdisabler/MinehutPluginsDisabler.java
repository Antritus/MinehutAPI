package com.qntcore.minehutpluginsdisabler;

import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinehutPluginsDisabler extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Plugin cosmetics = Bukkit.getServer().getPluginManager().getPlugin("MinehutCosmetics");
		Plugin analytics = Bukkit.getServer().getPluginManager().getPlugin("MinehutAnalytics");
		Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MinehutPlugin");
		try {
			if (analytics != null) {
				Bukkit.getPluginManager().disablePlugin(cosmetics);
				getLogger().info("Disabled minehut cosmetics");
			}
		} catch (Exception ignore){
		}
		try {
			if (analytics != null) {
				Bukkit.getPluginManager().disablePlugin(analytics);
				getLogger().info("Disabled minehut analytics");
			}
		} catch (Exception ignore){
		}
		try {
			if (plugin != null) {
				Bukkit.getPluginManager().disablePlugin(plugin);
				getLogger().info("Disabled minehut plugin");
			}
		} catch (Exception ignore){
		}
	}

	@Override
	public void onDisable() {
	}
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e){
		String cmd = e.getMessage();
		if (cmd.contains(" ")){
			cmd = cmd.split(" ")[0];
		}
		cmd = cmd.replace("//", "{$$$slash$$$}");
		cmd = cmd.replace("/", "");
		cmd = cmd.replace("{$$$slash$$$}", "//");
		PluginCommand command= getServer().getPluginCommand(cmd);
		System.out.println(command.getPlugin().getName());
		if (command.getPlugin().getName().toLowerCase().contains("minehutcosmetics")
				|| command.getPlugin().getName().toLowerCase().contains("minehut")
				|| command.getPlugin().getName().equalsIgnoreCase("cosmetics")
				|| command.getPlugin().getName().equalsIgnoreCase("debugcosmetics")
				|| command.getPlugin().getName().equalsIgnoreCase("skin")
				|| command.getPlugin().getName().equalsIgnoreCase("unskin")
		){
			e.getPlayer().sendMessage("This command has been disabled by minehut disabler!");
			e.setCancelled(true);
		}
	}
}