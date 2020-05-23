package com.sapient;

public class Shape {

    private int numberOfSide;

    public void calculateShapeArea(int numberOfSides,int sideLength){

        if(numberOfSides == 1){
            Circle circle = new Circle(sideLength);
            System.out.println("circle area is: " +circle.calculateArea() );
        }
        else if(numberOfSides == 4){
            Square square = new Square(sideLength);
            System.out.println("sqaure area is: " + square.calculateArea());
        }
        else if (numberOfSides == 3){
            Triangle triangle = new Triangle(sideLength);
            System.out.println("Triangle area is: "+ triangle.calculateArea());
        }
        else {
            System.out.println("No shape is present");
        }

    }
}
