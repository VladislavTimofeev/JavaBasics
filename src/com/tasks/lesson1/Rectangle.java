package com.tasks.lesson1;

/**
 * Create a Java class called "Rectangle" that represents a rectangle shape. The class should have the following attributes:
 * <p>
 * Length (double): Represents the length of the rectangle.
 * Width (double): Represents the width of the rectangle.
 * The class should have the following methods:
 * <p>
 * Constructor: Initialize the length and width of the rectangle.
 * getArea(): Calculate and return the area of the rectangle (length * width).
 * getPerimeter(): Calculate and return the perimeter of the rectangle (2 * (length + width)).
 * isSquare(): Check if the rectangle is a square (length == width).
 * Create an instance of the Rectangle class, set the length and width values, and print out the area, perimeter, and whether it's a square or not.
 * <p>
 * Example usage:
 * <p>
 * java
 * <p>
 * Rectangle rectangle = new Rectangle(4.5, 3.2);
 * System.out.println("Area: " + rectangle.getArea());
 * System.out.println("Perimeter: " + rectangle.getPerimeter());
 * System.out.println("Is Square: " + rectangle.isSquare());
 * <p>
 * <p>
 * Expected output:
 * Area: 14.4
 * Perimeter: 15.4
 * Is Square: false
 */

public class Rectangle {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

}
