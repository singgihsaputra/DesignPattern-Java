package com.singgih.decoratorpattern.breadmenu;

import com.singgih.decoratorpattern.Bread;

/**
 * Created by singgihrs on 3/13/17.
 */
public class Pizza extends Bread {

    private static final double COST = 50000;

    private static final String DESC  = "Pizza";

    public Pizza(){
        description = DESC;
    }

    @Override
    public double cost() {
        return COST;
    }
}
