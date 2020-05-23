package com.sapient;

public class Square {

    private int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public int calculateArea(){
        return sides*sides;
    }
}
