package com.singgih.compoundpattern;

import com.singgih.compoundpattern.factory.AbstractWarriorFactory;

/**
 * Created by singgihrs on 5/29/17.
 */
public class WarriorSimulator {

    public void simulate(AbstractWarriorFactory warriorFactory){
        Warrior knight = warriorFactory.createKnight();
        Warrior troll = warriorFactory.createTroll();
        Warrior dragon = warriorFactory.createDragon();

        System.out.println("\n-- Warrior Simulator --");

        Troops troops = new Troops();

        troops.add(knight);
        troops.add(troll);

        Troops dragons = new Troops();
        dragons.add(dragon);
        dragons.add(dragon);

        troops.add(dragons);
        simulate(dragons);

        simulate(troops);

        System.out.println("\nWarriors with strategist :");
        Strategist strategist = new Strategist();
        troops.registerObserver(strategist);
        simulate(troops);

        System.out.println("\nWarriors have attacked " + FightCounter.getAttackNumber()+" times");
    }

    public void simulate(Warrior warrior){
        warrior.fight();
    }
}
