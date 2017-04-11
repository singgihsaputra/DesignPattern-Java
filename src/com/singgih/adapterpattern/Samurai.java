package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class Samurai implements Hero {
    @Override
    public void slash() {
        System.out.println("Use katana to slash the enemy");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
