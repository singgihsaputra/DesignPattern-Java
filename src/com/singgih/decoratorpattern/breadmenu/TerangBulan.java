package com.singgih.decoratorpattern.breadmenu;

import com.singgih.decoratorpattern.Bread;

/**
 * Created by singgihrs on 3/13/17.
 */
public class TerangBulan extends Bread {

    private static final double COST = 20000;

    private static final String DESC  = "Terangbulan";

    public TerangBulan(){
        description = DESC;
    }

    @Override
    public double cost() {
        return COST;
    }
}
