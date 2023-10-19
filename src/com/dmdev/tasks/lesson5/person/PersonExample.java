package com.dmdev.tasks.lesson5.person;

public class PersonExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person pert = new Person(2, "Ivan", "Ivanov");
        //Person pert = new Person(2, "Petr", "Petrov");

        System.out.println(ivan.hashCode());
        System.out.println(pert.hashCode());
        System.out.println(ivan.equals(pert));

    }


}
