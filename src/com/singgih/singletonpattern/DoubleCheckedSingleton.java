package com.singgih.singletonpattern;

/**
 * Created by singgihrs on 3/26/17.
 */
public class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton uniqeInstance;

    private DoubleCheckedSingleton() {
        System.out.println("Set instance double checked singleton");
    }

    public static DoubleCheckedSingleton getInstance() {
        if (uniqeInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (uniqeInstance == null) {
                    uniqeInstance = new DoubleCheckedSingleton();
                }
            }
        }

        return uniqeInstance;
    }
}
