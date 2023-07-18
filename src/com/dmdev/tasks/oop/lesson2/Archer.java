package com.dmdev.tasks.oop.lesson2;

import com.dmdev.tasks.lesson4.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Стрельную из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
