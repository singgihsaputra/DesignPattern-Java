package com.singgih.observerpattern.withoutjavautil;

/**
 * Created by singgihrs on 3/9/17.
 */
public class CurrentBattleAction implements Observer, BattleElement {

    private boolean enemeyAttacking;

    private Subject character;

    public CurrentBattleAction(Subject character) {
        this.character = character;
        character.registerObserver(this);
    }

    @Override
    public void update(boolean enemyAttacking) {
        this.enemeyAttacking = enemyAttacking;
        performAction();
    }

    @Override
    public void performAction() {
        System.out.println(enemeyAttacking ? "Hero perform Deffense" : "Hero perform Attack");
    }
}
