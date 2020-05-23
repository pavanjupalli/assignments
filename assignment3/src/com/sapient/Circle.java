package com.sapient;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14*radius*radius;
    }

}
