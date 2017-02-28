package com.singgih.strategypattern;

import com.singgih.strategypattern.characters.King;
import com.singgih.strategypattern.characters.Knight;
import com.singgih.strategypattern.characters.Queen;
import com.singgih.strategypattern.characters.Troll;
import com.singgih.strategypattern.weaponbehavior.AxeBehavior;
import com.singgih.strategypattern.weaponbehavior.BowAndArrowBehavior;
import com.singgih.strategypattern.weaponbehavior.KnifeBehavior;
import com.singgih.strategypattern.weaponbehavior.SwordBehavior;

/**
 * Created by singgihrs on 2/28/17.
 */
public class Main {

    public static void main(String[] args) {
        Character character = new King();
        character.fight();
        character.performAttack();
        character.setWeaponBehavior(new KnifeBehavior());
        character.performAttack();
        System.out.println();

        character = new Queen();
        character.fight();
        character.performAttack();
        character.setWeaponBehavior(new BowAndArrowBehavior());
        character.performAttack();
        System.out.println();

        character = new Knight();
        character.fight();
        character.performAttack();
        character.setWeaponBehavior(new SwordBehavior());
        character.performAttack();
        System.out.println();

        character = new Troll();
        character.fight();
        character.performAttack();
        character.setWeaponBehavior(new AxeBehavior());
        character.performAttack();
    }

}
