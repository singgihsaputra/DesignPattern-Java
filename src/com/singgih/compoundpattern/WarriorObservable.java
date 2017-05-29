package com.singgih.compoundpattern;

/**
 * Created by singgihrs on 5/29/17.
 */
public interface WarriorObservable {

    public void registerObserver(Observer observer);

    public void notifiyObservers();
}
