package com.singgih.commandpattern;

/**
 * Created by singgihrs on 4/3/17.
 */
public class RoboDuckFire implements Command {

    private RoboDuck roboDuck;

    public RoboDuckFire(RoboDuck roboDuck) {
        this.roboDuck = roboDuck;
    }

    @Override
    public void execute() {
        roboDuck.fireMissile();
    }

    @Override
    public void undo() {
        roboDuck.stopFireMissile();
    }
}
