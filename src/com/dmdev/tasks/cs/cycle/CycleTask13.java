package com.dmdev.tasks.cs.cycle;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * <p>
 * Программа должна выводить:
 * <p>
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 * <p>
 * Не использовать массивы!
 */
public class CycleTask13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N days: ");
        int days = scanner.nextInt();

        printStatistic(days);
    }

    private static void printStatistic(int days) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int maxValue = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Input value for a day: " + (i + 1));
            int value = scanner.nextInt();
            sum += value;
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("Amount of days: " + days);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double) sum / days));
        System.out.println("Max: " + maxValue);
    }
}
