package com.dmdev.tasks.cs.array;

/**
 * 1. Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
public class ArrayTask1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);
        printReversArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printReversArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
