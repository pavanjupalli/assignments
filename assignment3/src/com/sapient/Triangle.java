package com.sapient;

public class Triangle {

    private int side;

    public Triangle(int side) {
        this.side = side;
    }

    public double calculateArea(){
        return 0.433*side*side;
    }


}
