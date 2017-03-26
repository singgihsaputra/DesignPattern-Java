package com.singgih.factorypattern.abstractfactorypattern.MilkshakeIngredientFactory;

import com.singgih.factorypattern.abstractfactorypattern.IceFloat.IceFloat;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.Sugar;
import com.singgih.factorypattern.abstractfactorypattern.Topping.Topping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by singgihrs on 3/21/17.
 */
public interface MilkshakeIngredientFactory {

    public Sugar createSugar();

    public IceFloat createIceFloat();

    public List<Topping> createTopping();
}
