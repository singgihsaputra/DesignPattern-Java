package com.singgih.strategypattern.characters;

import com.singgih.strategypattern.Character;
import com.singgih.strategypattern.WeaponBehavior;
import com.singgih.strategypattern.weaponbehavior.SwordBehavior;

/**
 * Created by singgihrs on 2/28/17.
 */
public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Knight support the King");
    }

}
