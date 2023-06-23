package com.tasks.lesson1;

/**
 * Create a Java class called "Circle" that represents a circle shape. The class should have the following attributes:
 * <p>
 * Radius (double): Represents the radius of the circle.
 * The class should have the following methods:
 * <p>
 * Constructor: Initialize the radius of the circle.
 * <p>
 * getArea(): Calculate and return the area of the circle (π * radius^2).
 * <p>
 * getCircumference(): Calculate and return the circumference of the circle (2 * π * radius).
 * <p>
 * isBig(): Check if the circle is considered big (radius > 10).
 * <p>
 * Create an instance of the Circle class, set the radius value, and print out the area, circumference, and whether it's considered big or not.
 * <p>
 * Example usage:
 * <p>
 * <p>
 * Circle circle = new Circle(7.5);
 * System.out.println("Area: " + circle.getArea());
 * System.out.println("Circumference: " + circle.getCircumference());
 * System.out.println("Is Big: " + circle.isBig());
 * Expected output:
 * <p>
 * <p>
 * Area: 176.71458676442586
 * Circumference: 47.12388980384689
 * Is Big: false
 */
public class Circle {

    double radius;
    final double pi = 3.14;


    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return pi * (radius * radius);
    }

    double getCircumference() {
        return 2 * pi * radius;
    }

    boolean isBig() {
        return radius > 10;
    }

}
