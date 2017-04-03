package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class Main {

    public static void main(String[] args) {

        SimpleControl simpleControl = new SimpleControl();

        RoboDuck roboDuck = new RoboDuck();

        RoboDuckSwimming roboDuckSwimming = new RoboDuckSwimming(roboDuck);
        RoboDuckFloating roboDuckFloating = new RoboDuckFloating(roboDuck);

        RoboDuckQuack roboDuckQuack = new RoboDuckQuack(roboDuck);
        RoboDuckSilent roboDuckSilent = new RoboDuckSilent(roboDuck);

        RoboDuckFire roboDuckFire = new RoboDuckFire(roboDuck);
        RoboDuckStopFire roboDuckStopFire = new RoboDuckStopFire(roboDuck);

        simpleControl.setCommand(0, roboDuckSwimming, roboDuckFloating);
        simpleControl.setCommand(1, roboDuckQuack, roboDuckSilent);
        simpleControl.setCommand(2, roboDuckFire, roboDuckStopFire);

        simpleControl.onButtonWasPressed(0);
        simpleControl.onButtonWasPressed(1);
        simpleControl.offButtonWasPressed(0);
        simpleControl.onButtonWasPressed(2);
        simpleControl.undoButton();

        //Macro command
        System.out.println("\nMacro command sample : ");
        MacroCommand macroOnCommand = new MacroCommand(new Command[]{new RoboDuckSwimming(roboDuck), new RoboDuckFire(roboDuck)});
        MacroCommand macroOffCommand = new MacroCommand(new Command[]{new RoboDuckFloating(roboDuck), new RoboDuckStopFire(roboDuck)});
        simpleControl.setCommand(0, macroOnCommand, macroOffCommand);
        simpleControl.onButtonWasPressed(0);
        simpleControl.offButtonWasPressed(0);

    }
}
