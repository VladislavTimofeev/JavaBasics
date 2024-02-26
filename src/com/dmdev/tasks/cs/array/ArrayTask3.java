package com.dmdev.tasks.cs.array;

/**
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов.
 */
public class ArrayTask3 {
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };

        int[][] values2 = {
                {1, 6, 3},
                {4, 5, 6, 7},
                {7, 8}
        };
        System.out.println(isEquals(values1, values2));
    }

    private static boolean isEquals(int[][] firstArray, int[][] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            int[] array1 = firstArray[i];
            int[] array2 = secondArray[i];
            if (array1.length != array2.length) {
                return false;
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
