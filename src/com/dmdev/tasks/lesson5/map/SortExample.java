package com.dmdev.tasks.lesson5.map;

import com.dmdev.tasks.lesson5.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("123", "456", "14", "789");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );

        Collections.sort(personList);
        System.out.println(personList);

//        personList.sort(new NameComporator());
        personList.sort(Comparator.comparing(Person::getName));
        System.out.println(personList);
    }

    public static class NameComporator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
