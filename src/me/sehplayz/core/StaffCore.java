package me.sehplayz.core;

import me.sehplayz.commands.Ban;
import me.sehplayz.commands.Kick;
import me.sehplayz.commands.Staff;
import me.sehplayz.listener.StaffOn;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by sehplayz.
 *
 */
public class StaffCore extends JavaPlugin {

    //TODO: add staff chat
    //TODO: add ss, freeze, random tp, inventory see, social spy
    //TODO: add custom inventory and items
    //TODO: add warn commands
    //TODO: add silent ban
    //TODO: add ip checker

    private static final StaffCore instance = new StaffCore();
    private String version = "DEV";


    public static StaffCore getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Enable plugin!");
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {

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
