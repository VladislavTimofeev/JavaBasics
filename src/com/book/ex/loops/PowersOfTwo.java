package com.book.ex.loops;

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = 100;
        int power = 1;
        int i = 0;
        while (i <= n) {
            System.out.println(i + " " + power);
            power = 2 * power;
            i++;
        }
    }
}
