package com.singgih.iteratorpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class TruckStore implements Vehicle {
    private HashMap vehicleItems = new HashMap();

    public TruckStore() {
        addItem("Fuso", "Manual", "Mitsubishi");
        addItem("Dutro", "Manual", "Hino");
        addItem("Bagong", "Manual", "Mercedes benz");
    }

    private void addItem(String name, String type, String brand){
        vehicleItems.put(name, new VehicleItem(name, type, brand));
    }

    @Override
    public Iterator createIterator() {
        return vehicleItems.values().iterator();
    }
}
