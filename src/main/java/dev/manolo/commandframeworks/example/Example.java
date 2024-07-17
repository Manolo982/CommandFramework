package dev.manolo.commandframeworks.example;

import dev.manolo.commandframeworks.Command;
import dev.manolo.commandframeworks.CommandArgs;
import dev.manolo.commandframeworks.CommandFramework;
import dev.manolo.commandframeworks.example.manager.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    private CommandFramework framework;

    @Override
    public void onEnable() {
        new CommandManager(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
