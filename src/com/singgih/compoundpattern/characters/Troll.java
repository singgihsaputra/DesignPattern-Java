package com.singgih.compoundpattern.characters;

import com.singgih.compoundpattern.Observable;
import com.singgih.compoundpattern.Observer;
import com.singgih.compoundpattern.Warrior;

/**
 * Created by singgihrs on 5/29/17.
 */
public class Troll implements Warrior {
    Observable observable;

    public Troll() {
        observable = new Observable(this);
    }

    @Override
    public void fight() {
        System.out.println("Attack with axe");
        notifiyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifiyObservers() {
        observable.notifiyObservers();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
