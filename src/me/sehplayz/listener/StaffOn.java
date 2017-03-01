package me.sehplayz.listener;

import me.sehplayz.commands.staff;
import me.sehplayz.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

/**
 * Created by sehplayz.
 */
public class StaffOn implements Listener {

    @EventHandler
    public static void onDrop(PlayerDropItemEvent event) {
        Player p = event.getPlayer();
        event.setCancelled(true);
        Utils.getInstance().Message(p, "&l&cYou can't drop items while in staff mode");
    }

    @EventHandler
    public static void onPickup(PlayerPickupItemEvent event) {
        Player p = event.getPlayer();
        event.setCancelled(true);
        Utils.getInstance().Message(p, "&l&cYou can't pickup items while in staff mode");
    }

    @EventHandler
    public static void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if(staff.staffmode == true) {
            for(Player player : Bukkit.getServer().getOnlinePlayers()) {
                player.hidePlayer(p);
            }
        }else if(staff.staffmode == false) {
            for(Player player : Bukkit.getServer().getOnlinePlayers()) {
                player.showPlayer(p);
                Utils.getInstance().Message(p, "&l&7Player's can see you now!");
            }
        }
    }
}
