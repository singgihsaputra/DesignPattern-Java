package com.singgih.observerpattern.withoutjavautil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by singgihrs on 3/9/17.
 */
public class HeroCharacter implements Subject {

    public static final boolean ENEMY_ATTACK = true;

    public static final boolean ENEMY_PASSIVE = false;

    private List<Observer> observerList;

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
        if (observerList.size() > 0) {
            observerList.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
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
