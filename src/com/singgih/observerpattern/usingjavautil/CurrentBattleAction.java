package com.singgih.observerpattern.usingjavautil;

import com.singgih.observerpattern.withoutjavautil.BattleElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by singgihrs on 3/9/17.
 */
public class CurrentBattleAction implements Observer, BattleElement {

    private Observable character;

    private boolean enemeyAttacking;

    public CurrentBattleAction(Observable character) {
        this.character = character;
        character.addObserver(this);
    }

    @Override
    public void performAction() {
        System.out.println(enemeyAttacking ? "Hero perform Deffense" : "Hero perform Attack");
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
