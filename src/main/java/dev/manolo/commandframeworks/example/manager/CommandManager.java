package dev.manolo.commandframeworks.example.manager;

import dev.manolo.commandframeworks.CommandFramework;
import dev.manolo.commandframeworks.example.Example;
import dev.manolo.commandframeworks.example.commands.FeelCommand;

public class CommandManager {

    private CommandFramework framework;
    private Example plugin;

    public CommandManager(Example plugin){
        this.plugin = plugin;
        framework = new CommandFramework(plugin);
        framework.registerCommands(new FeelCommand());
    }

}
