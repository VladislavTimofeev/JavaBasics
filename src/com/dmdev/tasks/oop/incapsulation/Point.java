package com.dmdev.tasks.oop.incapsulation;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
