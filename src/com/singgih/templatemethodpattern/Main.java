package com.singgih.templatemethodpattern;

/**
 * Created by singgihrs on 4/16/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Jet Plane :");
        JetPlane jetPlane = new JetPlane();
        jetPlane.takeOff();

        System.out.println();

        System.out.println("Helicopter :");
        Helicopter helicopter = new Helicopter();
        helicopter.takeOff();
    }
}
