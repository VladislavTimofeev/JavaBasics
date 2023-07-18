package com.dmdev.tasks.oop.lesson2;

public class TrainingGround {

    public static void main(String[] args) {

        Hero warrior = new Warrior("Middle Warrior", 150);
        Hero mage = new Mage("Junior Mage", 100);
        Hero archer = new Archer("Senior Archer", 200);

        Enemy zombie = new Enemy("Zombie", 1000);

        attackEnemy(zombie, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heros) {

        while (enemy.isAlive()) {
            for (Hero hero : heros) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);

                }
            }
        }
    }
}
