package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckQuack implements Command {

    private RoboDuck roboDuck;

    public RoboDuckQuack(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.quack();
    }

    @Override
    public void undo() {
        roboDuck.silent();
    }
}
