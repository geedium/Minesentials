package me.minecraft.plugin

import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

import org.bukkit.entity.Player

import org.bukkit.event.entity.PlayerDeathEvent

public class MainEvent : Listener {
    @EventHandler
    public fun onDeath(event: PlayerDeathEvent) {
        event.keepInventory = true;
        event.deathMessage = "You died!";
    }
}