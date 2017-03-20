package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class CappucinoMilkshake extends MilkShake {

    public CappucinoMilkshake() {
        name = "Cappucino Milkshake";
        sugar = "Less sugar";
        iceFloat = "Cappucino and chocolate float";
        topping.add("Slice of silverqueen");
    }
}
