package com.dmdev.tasks.cs.cycle;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class CycleTask12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();

        printFibonacciRecursion(value);
    }

    private static void printFibonacci(int value) {
        int first = 0;
        int second = 1;
        while (second < value) {
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }
    }

    private static void printFibonacciRecursion(int value) {
        int first = 0;
        int second = 1;
        fibonacci(first, second, value);
    }

    private static void fibonacci(int first, int second, int value) {
        if (second < value) {
            System.out.println(second);
            fibonacci(second, first + second, value);
        }
    }

}
