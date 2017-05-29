package com.singgih.compoundpattern;

import com.singgih.compoundpattern.factory.AbstractWarriorFactory;
import com.singgih.compoundpattern.factory.CountingWarriorFactory;

/**
 * Created by singgihrs on 5/29/17.
 */
public class Main {

    public static void main(String[] args) {
        WarriorSimulator warriorSimulator = new WarriorSimulator();
        AbstractWarriorFactory countingWarriorFactory = new CountingWarriorFactory();
        warriorSimulator.simulate(countingWarriorFactory);
    }
}
