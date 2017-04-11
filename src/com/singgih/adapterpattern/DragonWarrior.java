package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class DragonWarrior implements DragonHero {

    @Override
    public void fire() {
        System.out.println("Shoot a fireball");
    }

    @Override
    public void fly() {
        System.out.println("Fly to move faster");
    }
}
