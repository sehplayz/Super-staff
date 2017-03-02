package me.sehplayz.core;

import me.sehplayz.commands.Ban;
import me.sehplayz.commands.Kick;
import me.sehplayz.commands.Staff;
import me.sehplayz.listener.StaffOn;
import me.sehplayz.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by sehplayz.
 *
 */
public class StaffCore extends JavaPlugin {

    //TODO: add staff chat
    //TODO: add ss, random tp, inventory see, social spy
    //TODO: add custom inventory and items
    //TODO: add warn command
    //TODO: add silent ban
    //TODO: add ip checker

    private static StaffCore instance;
    private String version = "DEV";


    public static StaffCore getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        Utils.getInstance().Logger(Level.INFO, "[SS/Super Staff] is now Enabled");
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        Utils.getInstance().Logger(Level.WARNING, "[SS/Super Staff] is now Disable");
        this.saveConfig();


    }

    public void registerListeners() {
        PluginManager var1 = Bukkit.getServer().getPluginManager();
        var1.registerEvents(new StaffOn(), this);
        var1.registerEvents(new StaffOn().new StaffOff(), this);
    }

    public void registerCommands() {
        this.getCommand("staff").setExecutor(new Staff());
        this.getCommand("ban").setExecutor(new Ban());
        this.getCommand("kick").setExecutor(new Kick());

    }
}
