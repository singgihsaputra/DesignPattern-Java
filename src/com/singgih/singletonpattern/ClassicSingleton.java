package com.singgih.singletonpattern;

/**
 * Created by singgihrs on 3/26/17.
 */
public class ClassicSingleton {

    private static ClassicSingleton uniqeInstance;

    private ClassicSingleton() {
        System.out.println("Set instance classic singleton");
    }

    public static ClassicSingleton getInstance() {
        if (uniqeInstance == null) {
            uniqeInstance = new ClassicSingleton();
        }

        return uniqeInstance;
    }
}
