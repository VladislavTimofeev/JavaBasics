package com.dmdev.tasks.lesson2;

public class Task5 {

    /**
     * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в
     * строке.
     */
    public static void main(String[] args) {

        String value = "fsdfds.,!fsdfsd.,?fdsfsdf!fdsfds!!!!!!";
        System.out.println(countSymbols(value));

    }

    public static int countSymbols(String value){
        String result = value.replace(".","")
                .replace(",","")
                .replace("!","");
        return value.length() - result.length();
    }

}
