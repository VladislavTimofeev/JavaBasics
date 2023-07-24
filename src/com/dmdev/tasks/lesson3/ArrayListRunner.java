package com.dmdev.tasks.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {

        //ArrayList<Integer> integers = new ArrayList<>(); мы должны программировать на уровне интерфейсов, следовательно след строка верная так как реализуем интерфейс.

        // [1, 2, 3, 4, 5]
        // при добавление новых элементов мы копируем изначальный список и по дефолту идет +2 значения
        // [1, 2, 3, 4, 5, 6, null]
        List<Integer> integers = new ArrayList<>(5);

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println();

    }
}
