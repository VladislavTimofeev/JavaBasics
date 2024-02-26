package com.dmdev.tasks.oop.incapsulation;

public class Rectangle {
    private Point leftUpperCorner;
    private Point rightUpperCorner;

    public Rectangle(Point leftUpperCorner, Point rightUpperCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightUpperCorner = rightUpperCorner;
    }

    public double getDiagonal() {
        return leftUpperCorner.distance(rightUpperCorner);
    }

    public double getArea() {
        return (rightUpperCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightUpperCorner.getY());
    }

}
