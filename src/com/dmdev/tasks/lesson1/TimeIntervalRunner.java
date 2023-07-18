package com.dmdev.tasks.lesson1;


/**
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами.
 * <p>
 * Создать метод для получения полного количества секунд в объекте
 * <p>
 * Создать два конструктора: первый принимает общее количество
 * секунд, второй - часы, минуты и секунды по отдельности.
 * <p>
 * Создать метод для вывода данных.
 */

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());

        timeInterval1.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval1);
        sumIntervals.print();
    }
}
