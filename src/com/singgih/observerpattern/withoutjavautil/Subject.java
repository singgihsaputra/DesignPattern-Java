package com.singgih.observerpattern.withoutjavautil;

/**
 * Created by singgihrs on 3/9/17.
 */
public interface Subject {

    void registerObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers();
}
