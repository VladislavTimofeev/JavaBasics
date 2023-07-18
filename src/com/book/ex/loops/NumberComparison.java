package com.book.ex.loops;

public class NumberComparison {
    /**
     * 1.3.1. Напишите программу, которая получает три целых числа как аргументы
     * командной строки и выводит сообщение " equal" , если все три числа равны, или
     * "not equal" в противном случае.
     */

    public static void main(String[] args) {
        compare(2,2,2);
    }

    public static void compare(int valueOne, int valueTwo, int valueTree) {
        if (valueOne == valueTwo && valueTwo==valueTree){
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
