package com.singgih.factorypattern.factorypattern;

/**
 * Created by singgihrs on 3/20/17.
 */
public abstract class MilkshakeStore {

    public static final String CAPPUCINO = "cappucino";

    public static final String VANILA = "vanila";

    public MilkShake orderMilkshake(String type){
        MilkShake milkShake = createMilkShake(type);
        milkShake.prepare();
        milkShake.shake();
        milkShake.putInGlass();
        milkShake.addSpoon();

        return milkShake;
    }

    public abstract MilkShake createMilkShake(String type);
}
