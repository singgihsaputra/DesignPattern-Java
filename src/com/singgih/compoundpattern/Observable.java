package com.singgih.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by singgihrs on 5/29/17.
 */
public class Observable implements WarriorObservable {
    ArrayList observers = new ArrayList();
    WarriorObservable warriorObservable;

    public Observable(WarriorObservable warriorObservable) {
        this.warriorObservable = warriorObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifiyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(warriorObservable);
        }
    }
}
