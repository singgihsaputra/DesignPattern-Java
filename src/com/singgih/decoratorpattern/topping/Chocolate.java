package com.singgih.decoratorpattern.topping;

import com.singgih.decoratorpattern.Bread;
import com.singgih.decoratorpattern.BreadTopping;

/**
 * Created by singgihrs on 3/13/17.
 */
public class Chocolate extends BreadTopping {

    private static final double COST = 12000;

    private static final String DESC  = "Chocolate";

    Bread bread;

    public Chocolate(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + ", " + DESC;
    }

    @Override
    public double cost() {
        return COST + bread.cost();
    }
}
