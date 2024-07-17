package dev.manolo.commandframeworks.example.commands;

import dev.manolo.commandframeworks.Command;
import dev.manolo.commandframeworks.CommandArgs;
import org.bukkit.entity.Player;

public class FeelCommand {


    @Command(name = "feel", aliases = { "testing" },description = "This is a test command")
    public void feel(CommandArgs args){
        args.getSender().sendMessage("This is a test command");
    }

}
