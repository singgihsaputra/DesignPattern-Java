package com.singgih.compositepattern;

import java.util.Iterator;

/**
 * Created by singgihrs on 4/25/17.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}