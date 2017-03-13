package com.singgih.observerpattern.withoutjavautil;

/**
 * Created by singgihrs on 3/9/17.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        HeroCharacter heroCharacter = new HeroCharacter();
        CurrentBattleAction currentBattleAction = new CurrentBattleAction();
        currentBattleAction.registerAttacker(heroCharacter);

        heroCharacter.setAction(HeroCharacter.ENEMY_PASSIVE);
        heroCharacter.setAction(HeroCharacter.ENEMY_ATTACK);
        heroCharacter.setAction(HeroCharacter.ENEMY_PASSIVE);
    }

}
