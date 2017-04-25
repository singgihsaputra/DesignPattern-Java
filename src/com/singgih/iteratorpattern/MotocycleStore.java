package com.singgih.iteratorpattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class MotocycleStore implements Vehicle {

    private static final int MAX_ITEM = 3;

    private VehicleItem[] vehicleItems;

    private int currentPosition = 0;

    public MotocycleStore() {
        vehicleItems = new VehicleItem[3];
        addItem("Spin", "Automatic", "Suzuki");
        addItem("Supra X", "Manual", "Honda");
        addItem("Mio", "Automatic", "Yamaha");
    }

    private void addItem(String name, String type, String brand) {
        if (currentPosition < MAX_ITEM) {
            vehicleItems[currentPosition] = new VehicleItem(name, type, brand);
            currentPosition += 1;
        } else {
            System.out.println("List vehicle item is full, item can't add to list vehicle.");
        }
    }


    @Override
    public Iterator createIterator() {
        return new MotorcycleStoreIterator(vehicleItems);
    }
}
