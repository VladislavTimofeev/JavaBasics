package com.dmdev.tasks.cs.array;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class ArrayTask2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        addingArray(array);
        ArrayTask1.printArray(array);
    }

    private static void addingArray(int[] array) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < array.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                array[currentIndex] = currentValue;
                currentIndex++;
            }

        }
    }
}
