package com.singgih.compositepattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by singgihrs on 4/25/17.
 */
public class CompositeIterator implements Iterator{

    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            VehicleStoreComponent vehicleStoreComponent = (VehicleStoreComponent) iterator.next();
            if (vehicleStoreComponent instanceof VehicleStore) {
                stack.push(vehicleStoreComponent.createIterator());
            }
            return vehicleStoreComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
