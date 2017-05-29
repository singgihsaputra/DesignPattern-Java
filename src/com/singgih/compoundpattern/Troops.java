package com.singgih.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by singgihrs on 5/29/17.
 */
public class Troops implements Warrior {
    ArrayList fighters = new ArrayList();

    public void add(Warrior warrior){
        fighters.add(warrior);
    }

    @Override
    public void fight() {
        Iterator iterator = fighters.iterator();
        while(iterator.hasNext()){
            Warrior warrior = (Warrior) iterator.next();
            warrior.fight();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = fighters.iterator();
        while (iterator.hasNext()){
            Warrior warrior = (Warrior) iterator.next();
            warrior.registerObserver(observer);
        }
    }

    @Override
    public void notifiyObservers() {

    }
}
