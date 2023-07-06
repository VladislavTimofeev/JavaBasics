package com.dmdev.tasks.lesson2;

public class Task2 {

    /**
     * заменить все грустные смайлики :( в строке на веселые :)
     */

    public static void main(String[] args) {
        String value = "asdsf :( gfdgdfg :( fdgfdg :) fdgfdgdf :) gfdgfdgdf :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
