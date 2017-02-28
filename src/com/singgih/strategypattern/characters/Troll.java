package com.singgih.strategypattern.characters;

import com.singgih.strategypattern.Character;
import com.singgih.strategypattern.WeaponBehavior;
import com.singgih.strategypattern.weaponbehavior.KnifeBehavior;
import com.singgih.strategypattern.weaponbehavior.SwordBehavior;

/**
 * Created by singgihrs on 2/28/17.
 */
public class Troll extends Character {

    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll attack in the Queen");
    }

}
