package KotlinTest

import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

import org.bukkit.entity.Player

import org.bukkit.event.entity.PlayerDeathEvent

public class MainEvent : Listener {
    @EventHandler
    public fun onDeath(event: PlayerDeathEvent) {
        event.setKeepInventory(true);
        event.setDeathMessage("You died!");
    }
}