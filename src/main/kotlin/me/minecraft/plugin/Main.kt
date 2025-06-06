/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package me.minecraft.plugin

import org.bukkit.plugin.java.JavaPlugin

object Singleton {
    lateinit var access: Main;
}

public class Main : JavaPlugin() {

    public override fun onEnable() {
        logger.info("Hello, this is plugin!");

        Singleton.access = this;
        server.pluginManager.registerEvents(MainEvent(), this);

        this.getCommand("back")?.setExecutor(CommandBack());
    }

    public override fun onDisable() {
        logger.info("Out!");
    }
}