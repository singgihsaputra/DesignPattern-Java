package com.singgih.iteratorpattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class Salesman {

    private Vehicle motocycleStore;

    private Vehicle carStore;

    private Vehicle truckStore;

    public Salesman(Vehicle motocycleStore, Vehicle carStore, Vehicle truckStore) {
        this.motocycleStore = motocycleStore;
        this.carStore = carStore;
        this.truckStore = truckStore;
    }

    public void printBrosur() {
        Iterator motocycleStoreIterator = motocycleStore.createIterator();
        Iterator carStoreIterator = carStore.createIterator();
        Iterator truckStoreIterator = truckStore.createIterator();
        System.out.println("\nMotocycle Store : ");
        printBrosur(motocycleStoreIterator);
        System.out.println("\nCar Store : ");
        printBrosur(carStoreIterator);
        System.out.println("\nTruck Store : ");
        printBrosur(truckStoreIterator);
    }

    private void printBrosur(Iterator iterator) {
        while (iterator.hasNext()) {
            VehicleItem vehicleItem = (VehicleItem) iterator.next();
            System.out.println(vehicleItem.getName() + " - " + vehicleItem.getType() + " - " + vehicleItem.getBrand());
        }
    }
}
