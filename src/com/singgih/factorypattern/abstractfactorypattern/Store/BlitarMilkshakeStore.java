package com.singgih.factorypattern.abstractfactorypattern.Store;

import com.singgih.factorypattern.abstractfactorypattern.Milkshake.Cappucino;
import com.singgih.factorypattern.abstractfactorypattern.Milkshake.MilkShake;
import com.singgih.factorypattern.abstractfactorypattern.Milkshake.Vanila;
import com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory.BlitarMilkshakeIngredientFactory;
import com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory.MilkshakeIngredientFactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class BlitarMilkshakeStore extends MilkshakeStore {

    private static final String STYLE = "Balitar Milkshake";

    @Override
    public MilkShake createMilkShake(String type) {
        MilkShake milkShake;

        MilkshakeIngredientFactory milkshakeIngredientFactory = new BlitarMilkshakeIngredientFactory();

        if (type.equals(MilkshakeStore.CAPPUCINO)) {
            milkShake = new Cappucino(milkshakeIngredientFactory);
        } else {
            milkShake = new Vanila(milkshakeIngredientFactory);
        }

        milkShake.setName(STYLE + " " + type);

        return milkShake;
    }
}
