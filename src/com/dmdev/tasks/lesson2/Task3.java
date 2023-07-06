package com.dmdev.tasks.lesson2;

public class Task3 {
    /**
     * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
     * возвращающую true, если строка начинается и заканчивается этим словом.
     */

    public static void main(String[] args) {

        String value = "123 fdsfsd fggdfgdf 1234";
        String word = "123";
        System.out.println(isStartAndEnd(value,word));

    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
