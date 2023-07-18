package com.dmdev.tasks.lesson4;

public class ListRunner {

    public static void main(String[] args) {

        List<String> list = new List<>(10);
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");

        String element = list.get(1);
        System.out.println(element);
    }
}
