package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class PendekarKeris implements Hero {
    @Override
    public void slash() {
        System.out.println("Use keris to slash the enemy");
    }

    @Override
    public void run() {
        System.out.println("Ride a horse and run");
    }
}
