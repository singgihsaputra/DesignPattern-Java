package com.singgih.singletonpattern;

/**
 * Created by singgihrs on 3/26/17.
 */
public class EagerlySingleton {

    private static EagerlySingleton uniqeInstance = new EagerlySingleton();

    private EagerlySingleton() {
        System.out.println("Set instance singleton eagerly");
    }

    public static EagerlySingleton getInstance() {
        return uniqeInstance;
    }
}
