package com.singgih.factorypattern.abstractfactorypattern.Milkshake;

import com.singgih.factorypattern.abstractfactorypattern.IceFloat.IceFloat;
import com.singgih.factorypattern.abstractfactorypattern.Sugar.Sugar;
import com.singgih.factorypattern.abstractfactorypattern.Topping.Topping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by singgihrs on 3/20/17.
 */
public abstract class MilkShake {

    public String name;

    public Sugar sugar;

    public IceFloat iceFloat;

    public List<Topping> topping = new ArrayList();

    public abstract void prepare();

    public void shake() {
        System.out.println("shake: mix and shake in 5 min");
    }

    public void putInGlass() {
        System.out.println("Put in glass");
    }

    public void addSpoon() {
        System.out.println("add a spoon");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        if (sugar != null) {
            result.append(sugar + "\n");
        }
        if (iceFloat != null) {
            result.append(iceFloat + "\n");
        }
        if (topping != null) {
            int i = 0;
            for (Topping toppingItem : topping) {
                result.append(toppingItem);
                if (i < topping.size() - 1) {
                    result.append(", ");
                }

                i++;
            }
            result.append("\n");
        }

        return result.toString();
    }

    public void compose(){
        System.out.print(toString());
    }
}
