package me.sehplayz.commands;

import me.sehplayz.listener.StaffOff;
import me.sehplayz.listener.StaffOn;
import me.sehplayz.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by sehplayz.
 */
public class staff implements CommandExecutor {

    public static boolean staffmode;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(strings.length == 0) {
            if(strings[0].startsWith("on")) {
                if(p.hasPermission("ss.command.staff")) {
                new StaffOn();
                staffmode = true;
                for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                    player.hidePlayer(p);
                }
            }else {
                    Utils.getInstance().Message(p, "&l&4You have no permission");
                }
            }else if(strings[0].startsWith("off")) {
                if(p.hasPermission("ss.command.staff")) {
                    new StaffOff();
                    staffmode = false;
                    for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                        player.showPlayer(p);
                    }
                }else {
                    Utils.getInstance().Message(p, "&l&4You have no permission");
                }
            }

        }else {
            Utils.getInstance().Message(p, "&l&7Using: /staff on/off");
        }
        return true;
    }
}
