package me.sehplayz.commands;

import me.sehplayz.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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
        if (s.equalsIgnoreCase("kick")) {
            if(!p.hasPermission("ss.command.kick")) {
                Utils.getInstance().Message(p, "&l&cYou can use this command cause you have not permission!");
                return true;
            }
            if (strings.length == 0) {
                Utils.getInstance().Message(p, "&l&cPlease specify a Player and a reason!");
            } else if (strings.length == 1) {
                Utils.getInstance().Message(p, "&l&cPlease specify a reason!");
            } else {
                Player target = Bukkit.getPlayer(strings[0]);

                if (target == null) {
                    Utils.getInstance().Message(p, "&l&c" + strings[0] +" &l&c isn't online!");
                    return true;
                }

                StringBuilder x = new StringBuilder();

                for (int i = 1; i < strings.length; i++) {
                    x.append(strings[i]+" ");
                }

                String kicker = "Server";

                if (commandSender instanceof Player) {
                    kicker = commandSender.getName();
                }

                target.kickPlayer(ChatColor.RED+ "You have been kicked from the server!\nBy: "+kicker+"\nReason: "+x.toString().trim());
                commandSender.sendMessage(ChatColor.GREEN+"Successfully kicked: "+target.getName());
            }


        }
        return true;
    }
}
