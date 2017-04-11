package com.singgih.facadepattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class Plane {
    Engine engine;

    Jet jet;

    Tire tire;

    Wing wing;

    public Plane(Engine engine, Jet jet, Tire tire, Wing wing) {
        this.engine = engine;
        this.jet = jet;
        this.tire = tire;
        this.wing = wing;
    }

    public void takeOff(){
        engine.on();
        jet.on();
        wing.swipeDown();
        tire.takeIn();
    }

    public void landing(){
        tire.takeOut();
        wing.swipeUp();
        jet.off();
        engine.off();
    }
}
