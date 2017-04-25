package com.singgih.iteratorpattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class MotorcycleStoreIterator implements Iterator {

    private VehicleItem[] vehicleItems;

    private int currentPosition = 0;


    public MotorcycleStoreIterator(VehicleItem[] vehicleItems) {
        this.vehicleItems = vehicleItems;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < vehicleItems.length && vehicleItems[currentPosition] != null;
    }

    @Override
    public Object next() {
        VehicleItem vehicleItem = vehicleItems[currentPosition];
        currentPosition += 1;
        return vehicleItem;
    }

    @Override
    public void remove() {
        if (currentPosition <= 0) {
            throw new IllegalStateException("You can't remove an vehicle until you've done at least one next()");
        }

        if (vehicleItems[currentPosition-1] != null) {
            for (int i=currentPosition-1; i < vehicleItems.length; i++) {
                vehicleItems[i] = vehicleItems[i+1];
            }
            vehicleItems[vehicleItems.length-1] = null;
        }
    }
}
