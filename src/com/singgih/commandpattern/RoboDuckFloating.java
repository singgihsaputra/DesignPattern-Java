package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckFloating implements Command {

    private RoboDuck roboDuck;

    public RoboDuckFloating(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.floating();
    }

    @Override
    public void undo() {
        roboDuck.swimming();
    }
}
