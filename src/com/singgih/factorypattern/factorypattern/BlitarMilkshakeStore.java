package com.singgih.factorypattern.factorypattern;

/**
 * Created by singgihrs on 3/20/17.
 */
public class BlitarMilkshakeStore extends MilkshakeStore {

    @Override
    public MilkShake createMilkShake(String type) {
        MilkShake milkShake;

        if(type.equals(MilkshakeStore.CAPPUCINO)){
            milkShake = new BlitarStyleCappucino();
        } else {
            milkShake = new BlitarStyleVanila();
        }

        return milkShake;
    }
}
