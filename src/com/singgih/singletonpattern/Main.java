package com.singgih.singletonpattern;

/**
 * Created by singgihrs on 3/26/17.
 */
public class Main {

    public static void main(String[] args) {
        ClassicSingleton.getInstance();
        ClassicSingleton.getInstance();

        SynchronizedSingleton.getInstance();
        SynchronizedSingleton.getInstance();

        EagerlySingleton.getInstance();
        EagerlySingleton.getInstance();

        DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton.getInstance();
    }
}
