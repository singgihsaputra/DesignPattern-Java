package com.singgih.iteratorpattern;

/**
 * Created by singgihrs on 4/25/17.
 */
public class Main {

    public static void main(String[] args) {
        MotocycleStore motocycleStore = new MotocycleStore();
        CarStore carStore = new CarStore();
        TruckStore truckStore = new TruckStore();

        Salesman salesman = new Salesman(motocycleStore, carStore, truckStore);
        salesman.printBrosur();
    }
}
