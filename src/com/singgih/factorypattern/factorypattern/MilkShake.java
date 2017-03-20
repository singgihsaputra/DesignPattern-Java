package com.singgih.factorypattern.factorypattern;

import java.util.ArrayList;

/**
 * Created by singgihrs on 3/20/17.
 */
public class MilkShake {

    public String name;

    public String sugar;

    public String iceFloat;

    public ArrayList topping = new ArrayList();

    public void prepare() {
        String prepareText = "";
        prepareText += "Preparing " + name;
        prepareText += "\nAdding sugar : "+sugar;
        prepareText += "\nAdding ice float : "+iceFloat;
        prepareText += "\nAdding topping...";
        for (int i=0; i<topping.size(); i++) {
            prepareText += "\n" + topping.get(i);
        }
        System.out.println("\n\nprepare: " + prepareText);
    }

    public void shake() {
        System.out.println("shake: mix and shake in 5 min");
    }

    public void putInGlass() {
        System.out.println("Put in glass");
    }

    public void addSpoon() {
        System.out.println("add a spoon");
    }

    public String getName() {
        return name;
    }
}
