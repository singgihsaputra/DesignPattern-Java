package com.singgih.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class CarStore implements Vehicle {
    private ArrayList<VehicleItem> vehicleItems;

    public CarStore() {
        vehicleItems = new ArrayList<>();
        addItem("Pajero", "Manual", "Mitsubishi");
        addItem("Fortuner", "Automatic", "Toyota");
        addItem("Camaro", "Manual", "Chevrolet");
        addItem("Avanza", "Automatic", "Toyota");
    }

    private void addItem(String name, String type, String brand){
        vehicleItems.add(new VehicleItem(name, type, brand));
    }

    @Override
    public Iterator createIterator() {
        return vehicleItems.iterator();
    }
}
