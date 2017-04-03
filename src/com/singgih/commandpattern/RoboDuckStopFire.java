package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckStopFire implements Command {

    private RoboDuck roboDuck;

    public RoboDuckStopFire(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.stopFireMissile();
    }

    @Override
    public void undo() {
        roboDuck.fireMissile();
    }
}
