package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class Main {

    public static void main(String[] args) {
        SimpleMilkShakeFactory simpleMilkShakeFactory = new SimpleMilkShakeFactory();
        MilkshakeStore milkshakeStore = new MilkshakeStore(simpleMilkShakeFactory);
        milkshakeStore.orderMilkshake(SimpleMilkShakeFactory.CAPPUCINO);
        milkshakeStore.orderMilkshake(SimpleMilkShakeFactory.CHOCOLATE);
        milkshakeStore.orderMilkshake(SimpleMilkShakeFactory.VANILA);
    }
}
