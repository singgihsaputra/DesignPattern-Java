package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class Swordsman implements Hero {
    @Override
    public void slash() {
        System.out.println("Use blade and sword to slash the enemy");
    }

    @Override
    public void run() {
        System.out.println("Ride with motorcycle");
    }
}
