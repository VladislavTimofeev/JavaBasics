package com.dmdev.tasks.lesson4.weapon;

import com.dmdev.tasks.lesson4.weapon.RangeWeapon;

public class Bow implements RangeWeapon {

    @Override
    public int getDamage() {
        return 10;
    }
}
