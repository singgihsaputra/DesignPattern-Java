package com.singgih.adapterpattern;

/**
 * Created by singgihrs on 4/11/17.
 */
public class DragonHeroAdapter implements Hero{

    private DragonHero dragonHero;

    public DragonHeroAdapter(DragonHero dragonHero) {
        this.dragonHero = dragonHero;
    }

    @Override
    public void slash() {
        dragonHero.fire();
    }

    @Override
    public void run() {
        dragonHero.fly();
    }
}
