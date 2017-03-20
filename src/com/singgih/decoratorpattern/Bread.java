package com.singgih.decoratorpattern;

/**
 * Created by singgihrs on 3/13/17.
 */
public abstract class Bread {

    public String description = "Bread";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
