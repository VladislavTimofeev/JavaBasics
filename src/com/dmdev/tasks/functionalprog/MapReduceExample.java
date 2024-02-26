package com.dmdev.tasks.functionalprog;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * Найти студента с максимальным возрастом, количество студентов 3 000 000
     * <p>
     * [1000 000] -> age -> max
     * <p>
     * [1000 000] -> age -> max -> max
     * <p>
     * [1000 000] -> age -> max
     * <p>
     * Мы можем использовать мнеогопоточность чтобы распараллелить наши вычисления
     */

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(23, "Peret"),
                        new Student(34, "Vasua"),
                        new Student(45, "Sveta"),
                        new Student(20, "Kate"),
                        new Student(68, "Den"),
                        new Student(101, "Kira")
                )
                .sequential()
//                .map(Student::getAge)
                .filter(student -> student.getAge() < 18)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);

        maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
                .filter(age -> age > 25);
    }

}
