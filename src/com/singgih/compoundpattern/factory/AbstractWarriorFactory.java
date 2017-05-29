package com.singgih.compoundpattern.factory;

import com.singgih.compoundpattern.Warrior;

/**
 * Created by singgihrs on 5/29/17.
 */
public abstract class AbstractWarriorFactory {

    public abstract Warrior createKnight();
    public abstract Warrior createTroll();
    public abstract Warrior createDragon();
}
