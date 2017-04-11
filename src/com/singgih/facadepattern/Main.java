package com.singgih.facadepattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Jet jet = new Jet();
        Tire tire = new Tire();
        Wing wing = new Wing();

        Plane plane = new Plane(engine, jet, tire, wing);
        plane.takeOff();
        System.out.println();
        plane.landing();
    }
}
