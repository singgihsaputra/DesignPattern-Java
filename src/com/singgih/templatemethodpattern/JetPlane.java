package com.singgih.templatemethodpattern;

/**
 * Created by singgihrs on 4/17/17.
 */
public class JetPlane extends AirPlane {

    @Override
    public boolean hasTire() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println("Turn on jet");
    }
}
