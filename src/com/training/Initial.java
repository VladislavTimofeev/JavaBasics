package com.training;

public class Initial {
    public static double[] swap(double array[], int i, int j) {

        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }
}
