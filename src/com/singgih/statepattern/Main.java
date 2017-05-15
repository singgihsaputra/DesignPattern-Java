package com.singgih.statepattern;

/**
 * Created by singgihrs on 5/15/17.
 */
public class Main {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addCoffeeBeans();
        coffeeMaker.generateCoffee();
        System.out.println();

        coffeeMaker.generateCoffee();
        coffeeMaker.addCoffeeBeans();
        System.out.println();

        coffeeMaker.addCoffeeBeans();
        coffeeMaker.generateCoffee();

    }
}
