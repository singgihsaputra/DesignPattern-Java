package com.singgih.factorypattern.abstractfactorypattern.Milkshake;

import com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory.MilkshakeIngredientFactory;

/**
 * Created by singgihrs on 3/22/17.
 */
public class TarikTea extends MilkShake {

    MilkshakeIngredientFactory milkshakeIngredientFactory;

    public TarikTea(MilkshakeIngredientFactory milkshakeIngredientFactory) {
        this.milkshakeIngredientFactory = milkshakeIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        sugar = milkshakeIngredientFactory.createSugar();
        iceFloat = milkshakeIngredientFactory.createIceFloat();
        topping = milkshakeIngredientFactory.createTopping();
    }
}