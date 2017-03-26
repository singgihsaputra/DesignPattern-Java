package com.singgih.factorypattern.abstractfactorypattern.Store;

import com.singgih.factorypattern.abstractfactorypattern.Milkshake.MilkShake;

/**
 * Created by singgihrs on 3/20/17.
 */
public abstract class MilkshakeStore {

    public static final String CAPPUCINO = "cappucino";

    public static final String VANILA = "vanila";

    public static final String TARIK_TEA = "tarik_tea";

    public MilkShake orderMilkshake(String type){
        MilkShake milkShake = createMilkShake(type);
        System.out.println("\n--- Making a " + milkShake.getName() + " ---");
        milkShake.prepare();;
        milkShake.compose();
        milkShake.shake();
        milkShake.putInGlass();
        milkShake.addSpoon();

        return milkShake;
    }

    public abstract MilkShake createMilkShake(String type);
}
