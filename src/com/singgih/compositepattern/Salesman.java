package com.singgih.compositepattern;

import java.util.Iterator;

import static com.singgih.compositepattern.VehicleItem.MANUAL_TYPE;

/**
 * Created by singgihrs on 4/25/17.
 */
public class Salesman {

    private VehicleStoreComponent allVechicleStore;

    public Salesman(VehicleStoreComponent allVechicleStore) {
        this.allVechicleStore = allVechicleStore;
    }

    public void printBrosur() {
        allVechicleStore.print();
    }

    public void printBrosurManualType() {
        Iterator iterator = allVechicleStore.createIterator();
        System.out.println("\n--------- Manual Type Vehicle Only --------");

        while (iterator.hasNext()) {
            VehicleStoreComponent vehicleStoreComponent = (VehicleStoreComponent) iterator.next();

            try {
                if (MANUAL_TYPE.equals(vehicleStoreComponent.getType())) {
                    vehicleStoreComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
