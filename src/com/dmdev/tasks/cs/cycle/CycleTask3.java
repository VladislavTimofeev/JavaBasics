package com.dmdev.tasks.cs.cycle;

/**
 * В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */
public class CycleTask3 {
    public static void main(String[] args) {
        int startYear = 1626;
        double sum = 24;
        double percent = 0.05;

        double result = calculate(startYear, sum, percent);
        System.out.println(result);
    }

    private static double calculate(int startYear, double sum, double percent) {
        double result = sum;
        for (int currentYear = startYear + 1; currentYear <= 2024; currentYear++) {
            result += result * percent;
            System.out.println(currentYear + " : " + result);
        }
        return result;
    }

}
