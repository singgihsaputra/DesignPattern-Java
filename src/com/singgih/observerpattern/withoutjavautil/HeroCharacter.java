package com.singgih.observerpattern.withoutjavautil;

import java.util.ArrayList;

/**
 * Created by singgihrs on 3/9/17.
 */
public class HeroCharacter implements Subject {

    public static final boolean ENEMEY_ATTACK = true;

    public static final boolean ENEMEY_PASSIVE = false;

    private ArrayList observerList;

    private boolean enemyAttacking;

    public HeroCharacter() {
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int index = observerList.indexOf(obs);
        if (index > 0) {
            observerList.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = (Observer) observerList.get(i);
            observer.update(enemyAttacking);
        }
    }

    public void actionChanged() {
        notifyObservers();
    }

    public void setAction(boolean enemyAttacking) {
        this.enemyAttacking = enemyAttacking;
        actionChanged();
    }
}
