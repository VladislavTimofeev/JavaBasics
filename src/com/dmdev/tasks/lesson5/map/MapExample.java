package com.dmdev.tasks.lesson5.map;

import com.dmdev.tasks.lesson5.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person pert = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(pert.getId(), pert);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());  // get our Nodes
//
//        for (Person person : map.values()) {
//            System.out.println(person.getName());
//        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }
}
