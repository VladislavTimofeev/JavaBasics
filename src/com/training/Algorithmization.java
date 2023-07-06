package com.training;

import java.util.Arrays;

public class Algorithmization {


    public static void pyramidOnTheRightSide(int n) {
        for (int i = 0; i <= n / 2; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n / 2; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    public static void rhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void sandClock(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
//        for (int i = 1; i < n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public static void upSideDownPyramid(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void fullPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reversPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pyramid(int n) {
        /**
         * Вывести пирамиду *
         * n - количество строк
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printResult(int[] array) {
        /**
         * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
         */

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }

    public static void findSumIfIndexIsPrimeNumber(double[] array) {
        /**
         * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
         * являются простыми числами.
         */

        double sum = 0;

        for (int i = 2; i < array.length; i++) {
            boolean prime = true;
            int temp = 2;
            while (temp <= Math.sqrt(i)) {
                if (i % temp == 0) {
                    prime = false;
                    break;
                }
                temp++;
            }
            if (prime) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void printNewArrayWithoutMin(int[] array) {
        /**
         * Дана последовательность целых чисел. Образовать новую последовательность, выбросив из
         * исходной те члены, которые равны min( , , , ) 1 2 n a a  a .
         * ArrayUtils.removeElement
         */

        int min = 0;
        int size = array.length;
        int[] newArray = new int[9];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
//                array[i] =
            }
        }

    }

    public static void changePlaceMinAndMaxElements(double[] array) {
        /**
         * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
         */

        double min = array[0];
        double max = array[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }

        }
        System.out.println("Минимальный элемент массива : " + min);
        System.out.println("Максимальный элемент массива : " + max);

        double temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        System.out.println("Замена минимального и максимального элементов : ");
        System.out.println(Arrays.toString(array));

    }

    public static void countNegativePositiveZeroElements(double[] array) {
        /**
         * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
         * положительных и нулевых элементов
         */

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (double v : array) {
            if (v < 0) {
                negative++;
            } else if (v > 0) {
                positive++;
            } else {
                zero++;
            }

        }
        System.out.println("negative = " + negative + " positive = " + positive + " zero = " + zero);
    }

    public static void replaceElementsWithGivenNumberAndCountReplacements(double[] array, double g) {
        /**
         * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного G, этим
         * числом. Подсчитать количество замен.
         */

        int replacementCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > g) {
                array[i] = g;
                replacementCount++;
            }
            System.out.println(array[i]);
        }
        System.out.println("Количество замен - " + replacementCount);
    }

    public static void findSumElementsMultiplesK(int[] array, int k) {
        /**
         * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
         *
         * 1 2 3 4 5 6
         * k = 2
         * 2 + 4 + 6 = 12
         *
         */
        int sum = 0;

        for (int j : array) {
            if (j % k == 0) {
                sum += j;
            }
        }
        System.out.println(sum);

    }
}
