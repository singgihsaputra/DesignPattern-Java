package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class ChocolateMilkshake extends MilkShake {

    public ChocolateMilkshake() {
        name = "Chocolate Milkshake";
        sugar = "Lots sugar";
        iceFloat = "Dark chocolate float";
        topping.add("Slice of silverqueen");
        topping.add("Slice of toblerone");
        topping.add("Slice of ovomaltine");
    }
}
