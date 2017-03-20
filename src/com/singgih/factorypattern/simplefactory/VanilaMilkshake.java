package com.singgih.factorypattern.simplefactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class VanilaMilkshake extends MilkShake {

    public VanilaMilkshake() {
        name = "Vanila Milkshake";
        sugar = "medium sugar";
        iceFloat = "Vanila float";
        topping.add("Slice of white silverqueen");
        topping.add("Few chocolate candy");
    }
}
