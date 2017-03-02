package me.sehplayz.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.logging.Level;

/**
 * Created by sehplayz.
 */
public class Utils {

    private static final Utils instance = new Utils();

    public static Utils getInstance() {
        return  instance;
    }

    public void Message(Player p, String msg) {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

    public void Logger(Level level, String msg) {

    }
}
