package com.singgih.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class VehicleStore extends VehicleStoreComponent {

    private ArrayList vehicleStoreComponents = new ArrayList();

    private String storeName;

    private String description;

    public VehicleStore( String storeName, String description) {
        this.storeName = storeName;
        this.description = description;
    }

    @Override
    public void add(VehicleStoreComponent vehicleStoreComponent) {
        vehicleStoreComponents.add(vehicleStoreComponent);
    }

    @Override
    public void remove(VehicleStoreComponent vehicleStoreComponent) {
        vehicleStoreComponents.remove(vehicleStoreComponent);
    }

    @Override
    public VehicleStoreComponent getChild(int index) {
        return (VehicleStoreComponent) vehicleStoreComponents.get(index);
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println(getStoreName()+" - "+getDescription());
        System.out.println("--------------------");

        Iterator iterator = vehicleStoreComponents.iterator();
        while (iterator.hasNext()) {
            VehicleStoreComponent vehicleStoreComponent = (VehicleStoreComponent) iterator.next();
            vehicleStoreComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(vehicleStoreComponents.iterator());
    }
}
