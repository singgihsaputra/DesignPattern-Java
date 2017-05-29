package com.singgih.compoundpattern.factory;

import com.singgih.compoundpattern.characters.DragonAdapter;
import com.singgih.compoundpattern.FightCounter;
import com.singgih.compoundpattern.Warrior;
import com.singgih.compoundpattern.characters.Dragon;
import com.singgih.compoundpattern.characters.Knight;
import com.singgih.compoundpattern.characters.Troll;

/**
 * Created by singgihrs on 5/29/17.
 */
public class CountingWarriorFactory extends AbstractWarriorFactory {
    @Override
    public Warrior createKnight() {
        return new FightCounter(new Knight());
    }

    @Override
    public Warrior createTroll() {
        return new FightCounter(new Troll());
    }

    @Override
    public Warrior createDragon() {
        return new FightCounter(new DragonAdapter(new Dragon()));
    }
}
