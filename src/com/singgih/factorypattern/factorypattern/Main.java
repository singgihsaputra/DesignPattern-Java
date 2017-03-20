package com.singgih.factorypattern.factorypattern;

/**
 * Created by singgihrs on 3/20/17.
 */
public class Main {

    public static void main(String[] args) {
        MilkshakeStore bltMilkshakeStore = new BlitarMilkshakeStore();

        MilkShake bltMilkshake = bltMilkshakeStore.orderMilkshake(MilkshakeStore.CAPPUCINO);
        System.out.println("Order : "+bltMilkshake.getName());

        bltMilkshakeStore.orderMilkshake(MilkshakeStore.VANILA);
        System.out.println("Order : "+bltMilkshake.getName());

        MilkshakeStore jktMilkshaeStore = new JakartaMilkshakeStore();

        MilkShake jktMilkshake = jktMilkshaeStore.orderMilkshake(MilkshakeStore.CAPPUCINO);
        System.out.println("Order : "+bltMilkshake.getName());

        jktMilkshaeStore.orderMilkshake(MilkshakeStore.VANILA);
        System.out.println("Order : "+bltMilkshake.getName());
    }
}
