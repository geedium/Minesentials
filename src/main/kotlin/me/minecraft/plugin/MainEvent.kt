package me.minecraft.plugin

import org.bukkit.Location
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

import org.bukkit.entity.Player

import org.bukkit.event.entity.PlayerDeathEvent

public class MainEvent : Listener {
    @EventHandler
    public fun onDeath(event: PlayerDeathEvent) {
        var player: Player = event.entity as Player
        var loc: Location = player.location as Location

        Singleton.access.config.set("DLX", loc.x)
        Singleton.access.config.set("DLY", loc.y)
        Singleton.access.config.set("DLZ", loc.z)
        Singleton.access.config.set("DP", loc.pitch)
        Singleton.access.config.set("DY", loc.yaw)
        Singleton.access.config.save(player.name)
    }
}