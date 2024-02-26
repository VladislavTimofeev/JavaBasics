package com.dmdev.tasks.cs.cycle;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class CycleTask11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();

        System.out.println("Sum digits: " + sum(value));
    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}
