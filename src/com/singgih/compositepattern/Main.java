package com.singgih.compositepattern;

/**
 * Created by singgihrs on 4/25/17.
 */
public class Main {

    public static void main(String[] args) {
        VehicleStoreComponent motocycleStore = new VehicleStore("Moto store", "Sell vehicle motocycle");
        VehicleStoreComponent carStore = new VehicleStore("Car store", "Sell vehicle car");
        VehicleStoreComponent truckStore = new VehicleStore("Truck store", "Sell vehicle truck");

        VehicleStoreComponent allVehicleStore = new VehicleStore("All Store", "All vehicle store");
        allVehicleStore.add(motocycleStore);
        allVehicleStore.add(carStore);
        allVehicleStore.add(truckStore);

        motocycleStore.add(new VehicleItem("Spin", "Automatic", "Suzuki"));
        motocycleStore.add(new VehicleItem("Supra X", VehicleItem.MANUAL_TYPE, "Honda"));
        motocycleStore.add(new VehicleItem("Mio", "Automatic", "Yamaha"));

        carStore.add(new VehicleItem("Avanza", "Automatic", "Toyota"));
        carStore.add(new VehicleItem("Pajero", VehicleItem.MANUAL_TYPE, "Mitsubishi"));
        carStore.add(new VehicleItem("Camaro", "Automatic", "Chevrolet"));

        truckStore.add(new VehicleItem("Bagong", VehicleItem.MANUAL_TYPE, "Mercedes Benz"));
        truckStore.add(new VehicleItem("Fuso", VehicleItem.MANUAL_TYPE, "Mitsubishi"));
        truckStore.add(new VehicleItem("Dutro", VehicleItem.MANUAL_TYPE, "Hino"));
        truckStore.add(carStore);

        Salesman salesman = new Salesman(allVehicleStore);
        salesman.printBrosur();
        salesman.printBrosurManualType();
    }
}
