package me.sehplayz.core;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by sehplayz.
 */
public class StaffCore extends JavaPlugin {

    private static final StaffCore instance = new StaffCore();
    private String version = "0.1";


    public static StaffCore getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {

    }

    public void registerListeners() {

    }

    public void registerCommands() {

    }
}
