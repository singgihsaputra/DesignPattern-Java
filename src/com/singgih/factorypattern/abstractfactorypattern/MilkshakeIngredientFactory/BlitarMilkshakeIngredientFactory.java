package com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory;

import com.singgih.factorypattern.abstractfactorypattern.IceFloat.CoconutIceFloat;
import com.singgih.factorypattern.abstractfactorypattern.IceFloat.IceFloat;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.ArenSugar;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.Sugar;
import com.singgih.factorypattern.abstractfactorypattern.Topping.ChocoChipsTopping;
import com.singgih.factorypattern.abstractfactorypattern.Topping.Topping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by singgihrs on 3/21/17.
 */
public class BlitarMilkshakeIngredientFactory implements MilkshakeIngredientFactory {


    @Override
    public Sugar createSugar() {
        return new ArenSugar();
    }

    @Override
    public IceFloat createIceFloat() {
        return new CoconutIceFloat();
    }

    @Override
    public List<Topping> createTopping() {
        List<Topping> topping = new ArrayList<>();
        topping.add(new ChocoChipsTopping());
        return topping;
    }
}
