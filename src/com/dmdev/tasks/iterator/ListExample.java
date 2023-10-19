package com.dmdev.tasks.iterator;

import com.dmdev.tasks.lesson4.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new List<>(10);

        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        list.add("String 5");

        for(String value : list){
            System.out.println(value);
        }
    }
}
