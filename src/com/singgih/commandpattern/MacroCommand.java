package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i=0; i<commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0; i<commands.length; i++) {
            commands[i].undo();
        }
    }
}