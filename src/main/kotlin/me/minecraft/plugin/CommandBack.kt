package me.minecraft.plugin

import org.bukkit.Location
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandBack: CommandExecutor
{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        var player: Player = sender as Player;

        if(command.name.equals("back", true)) {
            Singleton.access.config.load(player.name)

            var x:Double = Singleton.access.config.getInt("DLX").toDouble()
            var y:Double = Singleton.access.config.getInt("DLY").toDouble()
            var z:Double = Singleton.access.config.getInt("DLZ").toDouble()
            var pitch:Float = Singleton.access.config.getInt("DP").toFloat()
            var yaw:Float = Singleton.access.config.getInt("DY").toFloat()
            player.teleport(Location(player.world, x, y, z, pitch, yaw))

            player.sendMessage("You teleported to your last death location.")
            return true
        }

        return false
    }
}