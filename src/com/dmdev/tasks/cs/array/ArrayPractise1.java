package com.dmdev.tasks.cs.array;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
public class ArrayPractise1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }
}
