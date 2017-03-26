package com.singgih.factorypattern.abstractfactorypattern.Store;

import com.singgih.factorypattern.abstractfactorypattern.Milkshake.Cappucino;
import com.singgih.factorypattern.abstractfactorypattern.Milkshake.MilkShake;
import com.singgih.factorypattern.abstractfactorypattern.Milkshake.Vanila;
import com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory.JakartaMilkshakeIngredientFactory;
import com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory.MilkshakeIngredientFactory;

/**
 * Created by singgihrs on 3/20/17.
 */
public class JakartaMilkshakeStore extends MilkshakeStore {

    private static final String STYLE = "Jakarta Milkshake";

    @Override
    public MilkShake createMilkShake(String type) {
        MilkShake milkShake;

        MilkshakeIngredientFactory milkshakeIngredientFactory = new JakartaMilkshakeIngredientFactory();

        if (type.equals(MilkshakeStore.CAPPUCINO)) {
            milkShake = new Cappucino(milkshakeIngredientFactory);
        } else {
            milkShake = new Vanila(milkshakeIngredientFactory);
        }

        milkShake.setName(STYLE + " " + type);

        return milkShake;
    }
}
