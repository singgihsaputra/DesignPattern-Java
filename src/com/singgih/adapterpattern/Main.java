package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class Main {

    public static void main(String[] args) {
        PendekarKeris pendekarKeris = new PendekarKeris();
        Samurai samurai = new Samurai();
        Swordsman swordsman = new Swordsman();

        DragonWarrior dragonWarrior = new DragonWarrior();
        DragonHeroAdapter dragonHeroAdapter = new DragonHeroAdapter(dragonWarrior);
        dragonHeroAdapter.slash();
        dragonHeroAdapter.run();
        System.out.println();

        showBehavior(pendekarKeris);
        showBehavior(samurai);
        showBehavior(swordsman);
    }

    private static void showBehavior(Hero hero) {
        hero.slash();
        hero.run();
        System.out.println();
    }
}
