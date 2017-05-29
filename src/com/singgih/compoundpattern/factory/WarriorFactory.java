package com.singgih.compoundpattern.factory;

import com.singgih.compoundpattern.characters.DragonAdapter;
import com.singgih.compoundpattern.Warrior;
import com.singgih.compoundpattern.characters.Dragon;
import com.singgih.compoundpattern.characters.Knight;
import com.singgih.compoundpattern.characters.Troll;

/**
 * Created by singgihrs on 5/29/17.
 */
public class WarriorFactory extends AbstractWarriorFactory {
    @Override
    public Warrior createKnight() {
        return new Knight();
    }

    @Override
    public Warrior createTroll() {
        return new Troll();
    }

    @Override
    public Warrior createDragon() {
        return new DragonAdapter(new Dragon());
    }
}
