package com.singgih.compoundpattern.characters;

import com.singgih.compoundpattern.Observable;
import com.singgih.compoundpattern.Observer;
import com.singgih.compoundpattern.Warrior;
import com.singgih.compoundpattern.characters.Dragon;

/**
 * Created by singgihrs on 5/29/17.
 */
public class DragonAdapter implements Warrior {

    Dragon dragon;

    Observable observable;

    public DragonAdapter(Dragon dragon) {
        this.dragon = dragon;
        observable = new Observable(this);
    }

    @Override
    public void fight() {
        dragon.fire();
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
        return dragon.getClass().getSimpleName();
    }
}
