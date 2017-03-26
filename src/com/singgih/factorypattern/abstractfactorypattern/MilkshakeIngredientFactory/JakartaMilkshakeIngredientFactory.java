package com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory;

import com.singgih.factorypattern.abstractfactorypattern.IceFloat.ChocolateIceFloat;
import com.singgih.factorypattern.abstractfactorypattern.IceFloat.IceFloat;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.Sugar;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.TebuSugar;
import com.singgih.factorypattern.abstractfactorypattern.Topping.ChocoChipsTopping;
import com.singgih.factorypattern.abstractfactorypattern.Topping.JellyBeanTopping;
import com.singgih.factorypattern.abstractfactorypattern.Topping.Topping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by singgihrs on 3/21/17.
 */
public class JakartaMilkshakeIngredientFactory implements MilkshakeIngredientFactory {


    @Override
    public Sugar createSugar() {
        return new TebuSugar();
    }

    @Override
    public IceFloat createIceFloat() {
        return new ChocolateIceFloat();
    }

    @Override
    public List<Topping> createTopping() {
        List<Topping> topping = new ArrayList<>();
        topping.add(new ChocoChipsTopping());
        topping.add(new JellyBeanTopping());
        return topping;
    }
}
