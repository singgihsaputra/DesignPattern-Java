package com.singgih.factorypattern.factorypattern;

/**
 * Created by singgihrs on 3/20/17.
 */
public class JakartaMilkshakeStore extends MilkshakeStore{

    @Override
    public MilkShake createMilkShake(String type) {
        MilkShake milkShake;

        if(type.equals(MilkshakeStore.CAPPUCINO)){
            milkShake = new JakartaStyleCappucino();
        } else {
            milkShake = new JakartaStyleVanila();
        }

        return milkShake;
    }
}
