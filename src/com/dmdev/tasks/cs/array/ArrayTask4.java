package com.dmdev.tasks.cs.array;

/**
 * Написать 2 метода, которые определяют индекс минимального и максимального значения
 * одномерного массива соответственно.
 */
public class ArrayTask4 {
    public static void main(String[] args) {
        int[] arrays = {11, 2, 3, 4, -55, 6, 7, -8, 99};
        int result = findIndexMaxValue(arrays);
        System.out.println(result);

        int result2 = findIndexMinValue(arrays);
        System.out.println(result2);
    }

    public static int findIndexMinValue(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findIndexMaxValue(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
