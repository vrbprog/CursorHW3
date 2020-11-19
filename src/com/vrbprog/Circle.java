package com.vrbprog;


public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return radius * radius * Math.PI;
    }
}
