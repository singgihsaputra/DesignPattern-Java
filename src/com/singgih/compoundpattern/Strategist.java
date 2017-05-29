package com.singgih.compoundpattern;

/**
 * Created by singgihrs on 5/29/17.
 */
public class Strategist implements Observer {
    @Override
    public void update(WarriorObservable warriorObservable) {
        System.out.println("Strategist : "+warriorObservable+" just attack");
    }
}
