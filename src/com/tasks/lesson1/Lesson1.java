package com.tasks.lesson1;


public class Lesson1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4.5, 3.2);
        System.out.println("Area Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter Rectangle: " + rectangle.getPerimeter());
        System.out.println("Is Square Rectangle: " + rectangle.isSquare());

        System.out.println("==================================================");

        Circle circle = new Circle(7.5);
        System.out.println("Area Circle: " + circle.getArea());
        System.out.println("Circumference Circle: " + circle.getCircumference());
        System.out.println("Is big Circle: " + circle.isBig());

    }
}
