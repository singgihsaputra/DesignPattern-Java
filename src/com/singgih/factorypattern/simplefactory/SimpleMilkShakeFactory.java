package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class SimpleMilkShakeFactory {

    public static final String CHOCOLATE = "chocolate";

    public static final String CAPPUCINO = "cappucino";

    public static final String VANILA = "vanila";

    public MilkShake createMilkShake(String type){
        MilkShake milkShake;

        if (type.equals(CHOCOLATE)) {
            milkShake = new ChocolateMilkshake();
        } else if (type.equals(CAPPUCINO)) {
            milkShake = new CappucinoMilkshake();
        } else {
            milkShake = new VanilaMilkshake();
        }

        return milkShake;
    }


}
