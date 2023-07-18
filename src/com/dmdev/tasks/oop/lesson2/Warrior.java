package com.dmdev.tasks.oop.lesson2;

import com.dmdev.tasks.lesson4.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атаковал мечом " + enemy.getName());
        enemy.takeDamage(getDamage());

    }
}
