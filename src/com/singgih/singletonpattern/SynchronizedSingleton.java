package com.singgih.singletonpattern;

/**
 * Created by singgihrs on 3/26/17.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton uniqeInstance;

    private SynchronizedSingleton() {
        System.out.println("Set instance synchronized singleton");
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqeInstance == null) {
            uniqeInstance = new SynchronizedSingleton();
        }

        return uniqeInstance;
    }
}
