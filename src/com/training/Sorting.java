package com.training;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        //double[] array = {15, 3.1, 2.4, 1.3, 4.7, 7.5, 6, 2.7, 1.8, 9.0, 1.0, -10};
        double[] arrays = {6.2, 4.1, 11.3, 0, -5.5, 22.6, -1.6, 2.9};
        //double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //double[] nikitaAndVladik = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15};
//        1 4 5
//        3
//        0 - 2
//        1 > 3 ? no
//        4 > 3 ? yes index = 1;

        System.out.println(Arrays.toString(sortInsert(arrays)));
        //System.out.println(binarySearch(arrays, 9.8, 0, arrays.length - 1));
        //System.out.println(Arrays.toString(sortInsert(arrays)));
        //System.out.println(Arrays.toString(sortExchanges(array)));
        //System.out.println(Arrays.toString(selectSort()));
    }

    public static int binarySearch(double[] array, double value, int left, int right) {

        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < value) {
                left = mid + 1;
            } else if (array[mid] > value) {
                right = mid - 1;
            }
            if (left > right) {
                return left;
            }
        }
        return index;
    }

    public static double[] sortInsert(double[] array) {
        //{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15}; Взять массив, подвинуть относительно найдееного индекса вправо
        // и вставить элемент
        /**
         *  1 2 3 6 7 4
         *  иду по массиву при это в массиве я применяю БС, который возвращает мне indexElement, на месте которого
         *  должен стоять мой array[i]
         *
         *  x = currentValue
         *  pos = indexElement
         *  double currentValue = array[i];
         *  int indexElement = binarySearch(array, currentValue, 0, array.length);
         */

        double[] arr = array.clone();

        for (int i = 1; i < array.length; i++) {

            double currentValue = array[i];
            int indexElement = binarySearch(arr, currentValue, 0, i-1);
            arr = Initial.swap(arr, i, indexElement);

        }
        return arr;
    }

    public static double[] sortExchanges(double[] array) {
        /**
         * Дана последовательность чисел .Требуется переставить числа в порядке возрастания. Для этого сравниваются два
         * соседних числа 1 +i i a и a . Если 1 +  i i a a , то делается
         * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
         * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
         */

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Initial.swap(array, j, j + 1);
                    count++;
                }
            }

        }
        System.out.println("Количество перестановок " + count);
        return array;
    }

    public static int[] selectSort() {
        /**
         * Дана последовательность чисел n .Требуется переставить элементы так,
         * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
         * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
         * повторяется. Написать алгоритм сортировки выбором.
         */

        int[] array = {31, 2, 13, 47, 75, 6, 27, 18, 9, 10};

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[index] = temp;
        }
        return array;

    }
}
