package com.dmdev.tasks.lesson3;

import java.util.Arrays;

/**
 * Ограничения
 * 1. Нельзя наследоваться от ProcessorType
 * 2. ProcessorType не может наследовать другой класс
 *
 * Может реализовывать интерфейсы
 */
public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.toString());
        System.out.println(processorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());
    }
}
