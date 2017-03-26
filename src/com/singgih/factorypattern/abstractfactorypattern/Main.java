package com.singgih.factorypattern.abstractfactorypattern;

import com.singgih.factorypattern.abstractfactorypattern.Milkshake.MilkShake;
import com.singgih.factorypattern.abstractfactorypattern.Store.BlitarMilkshakeStore;
import com.singgih.factorypattern.abstractfactorypattern.Store.JakartaMilkshakeStore;
import com.singgih.factorypattern.abstractfactorypattern.Store.MilkshakeStore;

/**
 * Created by singgihrs on 3/20/17.
 */
public class Main {

    public static void main(String[] args) {
        MilkshakeStore bltMilkshakeStore = new BlitarMilkshakeStore();

        MilkShake bltMilkshake = bltMilkshakeStore.orderMilkshake(MilkshakeStore.CAPPUCINO);
        System.out.println("Order : " + bltMilkshake.getName());

        bltMilkshakeStore.orderMilkshake(MilkshakeStore.VANILA);
        System.out.println("Order : " + bltMilkshake.getName());

        bltMilkshakeStore.orderMilkshake(MilkshakeStore.TARIK_TEA);
        System.out.println("Order : " + bltMilkshake.getName());

        MilkshakeStore jktMilkshaeStore = new JakartaMilkshakeStore();

        MilkShake jktMilkshake = jktMilkshaeStore.orderMilkshake(MilkshakeStore.CAPPUCINO);
        System.out.println("Order : " + bltMilkshake.getName());

        jktMilkshaeStore.orderMilkshake(MilkshakeStore.VANILA);
        System.out.println("Order : " + bltMilkshake.getName());

        jktMilkshaeStore.orderMilkshake(MilkshakeStore.TARIK_TEA);
        System.out.println("Order : " + jktMilkshake.getName());
    }
}
