package com.dmdev.tasks.lesson5.map;

import com.dmdev.tasks.lesson5.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person pert = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(pert.getId(), pert);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
