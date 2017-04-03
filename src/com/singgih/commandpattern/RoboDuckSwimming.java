package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckSwimming implements Command {

    private RoboDuck roboDuck;

    public RoboDuckSwimming(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.swimming();
    }

    @Override
    public void undo() {
        roboDuck.floating();
    }
}
