package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckSilent implements Command {

    private RoboDuck roboDuck;

    public RoboDuckSilent(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.silent();
    }

    @Override
    public void undo() {
        roboDuck.quack();
    }
}
