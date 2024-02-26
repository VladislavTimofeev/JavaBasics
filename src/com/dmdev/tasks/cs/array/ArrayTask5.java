package com.dmdev.tasks.cs.array;

/**
 * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class ArrayTask5 {
    public static void main(String[] args) {
        int[] arrays = {11, 2, 3, 4, -55, 6, 7, 99};
        System.out.println("Sum : " + sum(arrays));
        System.out.println("Sum : " + sum2(arrays));

    }

    private static int sum2(int[] values) {
        int result = 0;
        int startIndex = ArrayTask4.findIndexMinValue(values);
        int endIndex = ArrayTask4.findIndexMaxValue(values);
        if (endIndex < startIndex) {
            int tmp = endIndex;
            endIndex = startIndex;
            startIndex = tmp;
        }
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }

    private static int sum(int[] values) {
        int result = 0;
        int minIndex = ArrayTask4.findIndexMinValue(values);
        int maxIndex = ArrayTask4.findIndexMaxValue(values);

        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);

        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }
}
