package com.singgih.decoratorpattern;

import com.singgih.decoratorpattern.breadmenu.Pizza;
import com.singgih.decoratorpattern.breadmenu.TerangBulan;
import com.singgih.decoratorpattern.topping.Cheese;
import com.singgih.decoratorpattern.topping.Chocolate;
import com.singgih.decoratorpattern.topping.Hazelnuts;

/**
 * Created by singgihrs on 3/13/17.
 */
public class Main {

    public static void main(String[] args) {
        Bread bread = new Pizza();
        System.out.println(bread.getDescription() + ", Rp. " + bread.cost());

        Bread bread2 = new Pizza();
        bread2 = new Cheese(bread2);
        bread2 = new Chocolate(bread2);
        System.out.println(bread2.getDescription() + ", Rp. " + bread2.cost());

        Bread bread3 = new TerangBulan();
        bread3 = new Hazelnuts(bread3);
        bread3 = new Chocolate(bread3);
        bread3 = new Cheese(bread3);
        System.out.println(bread3.getDescription() + ", Rp. " + bread3.cost());
    }
}
