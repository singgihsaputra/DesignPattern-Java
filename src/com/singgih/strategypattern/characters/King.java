package com.singgih.strategypattern.characters;

import com.singgih.strategypattern.Character;
import com.singgih.strategypattern.WeaponBehavior;
import com.singgih.strategypattern.weaponbehavior.SwordBehavior;

/**
 * Created by singgihrs on 2/28/17.
 */
public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King attack in front line");
    }

}
