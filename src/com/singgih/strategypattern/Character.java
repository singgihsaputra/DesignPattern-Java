package com.singgih.strategypattern;

/**
 * Created by singgihrs on 2/28/17.
 */
public abstract class Character {

    public WeaponBehavior weaponBehavior;

    public Character() {
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void performAttack(){
        weaponBehavior.useWeapon();
    }

}
