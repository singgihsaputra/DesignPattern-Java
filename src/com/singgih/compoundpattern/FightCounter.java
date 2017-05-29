package com.singgih.compoundpattern;

/**
 * Created by singgihrs on 5/29/17.
 */
public class FightCounter implements Warrior {
    Warrior warrior;

    static int numberOfAttacks;

    public FightCounter(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public void fight() {
        warrior.fight();
        numberOfAttacks++;
    }

    public static int getAttackNumber(){
        return numberOfAttacks;
    };

    @Override
    public void registerObserver(Observer observer) {
        warrior.registerObserver(observer);
    }

    @Override
    public void notifiyObservers() {
        warrior.notifiyObservers();
    }
}
