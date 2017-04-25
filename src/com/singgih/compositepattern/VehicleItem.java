package com.singgih.compositepattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class VehicleItem extends VehicleStoreComponent{

    public static final String MANUAL_TYPE = "Manual";

    String name;

    String type;

    String brand;

    public VehicleItem(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void print() {
        System.out.print(" " + getName() + " - " + getType() + " - " + getBrand());
        System.out.println();
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

}
