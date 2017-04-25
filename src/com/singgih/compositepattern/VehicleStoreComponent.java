package com.singgih.compositepattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public abstract class VehicleStoreComponent {

    public void add(VehicleStoreComponent vehicleStoreComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(VehicleStoreComponent vehicleStoreComponent) {
        throw new UnsupportedOperationException();
    }

    public VehicleStoreComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getStoreName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getType() {
        throw new UnsupportedOperationException();
    }

    public String getBrand() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
