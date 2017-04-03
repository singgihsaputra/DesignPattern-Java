package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class SimpleControl {

    private Command[] onCommand;

    private Command[] offCommand;

    private Command undo;

    private static final int maxCommand = 3;

    public SimpleControl() {
        onCommand = new Command[maxCommand];
        offCommand = new Command[maxCommand];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < maxCommand; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undo = noCommand;
    }

    public void setCommand(int slotNumb, Command onCommand, Command offCommand) {
        this.onCommand[slotNumb] = onCommand;
        this.offCommand[slotNumb] = offCommand;
    }

    public void onButtonWasPressed(int slotNumb) {
        this.onCommand[slotNumb].execute();
        undo = this.onCommand[slotNumb];
    }

    public void offButtonWasPressed(int slotNumb) {
        this.offCommand[slotNumb].execute();
        undo = this.offCommand[slotNumb];
    }

    public void undoButton() {
        undo.undo();
    }
}
