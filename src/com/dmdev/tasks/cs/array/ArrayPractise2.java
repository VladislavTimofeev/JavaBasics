package com.dmdev.tasks.cs.array;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый. На место удаленных элементов ставить цифру 0.
 */
public class ArrayPractise2 {
    public static void main(String[] args) {
        int[] values = {3, 9, 5, 3, 8, 0, 1, 3, 3, 3, 3, 3, 3, 7};
        findDuplicateValues(values);
        System.out.println(Arrays.toString(values));
    }

    private static void findDuplicateValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                    values[i] = 0;
                }
            }
        }
    }
}
