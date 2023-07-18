package com.epam.tasks.lesson2;

/**
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private static int valueOne = 10;
    private static int valueTwo = 5;

    public static void main(String[] args) {
        int result = sumValues(valueOne, valueTwo);
        System.out.println(result);

        System.out.println(findMaxValue(valueOne,valueTwo));
    }

    public static void printValues() {
        System.out.println("ValueOne = " + valueOne + "\nValueTwo = " + valueTwo);
    }

    public static int sumValues(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static int findMaxValue(int valueOne, int valueTwo) {
        return Math.max(valueOne, valueTwo);
    }
}
