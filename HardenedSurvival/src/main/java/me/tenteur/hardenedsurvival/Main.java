package me.tenteur.hardenedsurvival;

import me.tenteur.hardenedsurvival.Commands.UpgradeCommand;
import me.tenteur.hardenedsurvival.EventListeners.MobEventListener;
import me.tenteur.hardenedsurvival.EventListeners.PlayerEventListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        UtilityFunction.printConsole("§aStarting the plugin 'HARDENED SURVIVAL'...");
        getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);
        getServer().getPluginManager().registerEvents(new MobEventListener(), this);
        this.getCommand("upgrade").setExecutor(new UpgradeCommand());

    }

    @Override
    public void onDisable() {
        UtilityFunction.printConsole("§cStopping the plugin 'HARDENED SURVIVAL'...");
    }

    public static Plugin getPlugin() {
        return plugin;
    }

}
