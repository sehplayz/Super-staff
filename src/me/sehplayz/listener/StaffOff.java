package me.sehplayz.listener;

import me.sehplayz.util.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

/**
 * Created by sehplayz.
 */
public class StaffOff implements Listener{

    @EventHandler
    public static void onDrop(PlayerDropItemEvent event) {
        Player p = event.getPlayer();
        event.setCancelled(false);
    }

    @EventHandler
    public static void onPickup(PlayerPickupItemEvent event) {
        Player p = event.getPlayer();
        event.setCancelled(false);
    }
}
