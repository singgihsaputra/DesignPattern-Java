package com.singgih.templatemethodpattern;

/**
 * Created by singgihrs on 4/17/17.
 */
public abstract class AirPlane {

    public void takeOff(){
        turnOnEngine();
        fly();
        if(hasTire()) {
            hideTire();
        }
    }

    final void turnOnEngine(){
        System.out.println("Turn on engine");
    }

    public void hideTire(){
        System.out.println("Hide the tire");
    }

    //hook
    public boolean hasTire() {
        return false;
    }

    abstract void fly();
}
