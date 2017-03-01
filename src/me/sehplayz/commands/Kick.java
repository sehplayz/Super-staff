package me.sehplayz.commands;

import me.sehplayz.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by sehplayz.
 */
public class Kick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        Player target = Bukkit.getServer().getPlayer(strings[0]);
        String REASON = strings[1];
        if(command.getName().equalsIgnoreCase("kick")) {
            if(strings.length == 2) {
                if(p.hasPermission("ss.command.ban")) {
                    if(target == commandSender) {
                        target.kickPlayer(REASON);
                        Utils.getInstance().Message(p, "&l&7You can't ban your self!");
                    }else {
                        target.kickPlayer(REASON);
                    }
                }
                return true;
            }
        }
        return true;
    }
}
