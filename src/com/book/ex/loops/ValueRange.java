package com.book.ex.loops;

public class ValueRange {
    public static void main(String[] args) {
        findValueRange(0.4,0.9);
    }

    public static void findValueRange(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
