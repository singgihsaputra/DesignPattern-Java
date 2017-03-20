package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class MilkshakeStore {

    private SimpleMilkShakeFactory simpleMilkShakeFactory;

    public MilkshakeStore(SimpleMilkShakeFactory simpleMilkShakeFactory) {
        this.simpleMilkShakeFactory = simpleMilkShakeFactory;
    }

    public MilkShake orderMilkshake(String type){
        MilkShake milkShake = simpleMilkShakeFactory.createMilkShake(type);
        milkShake.prepare();
        milkShake.shake();
        milkShake.putInGlass();
        milkShake.addSpoon();

        return milkShake;
    }
}
