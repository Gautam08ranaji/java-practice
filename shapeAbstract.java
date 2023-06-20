package com.example.fulljavacourse;

abstract class Shape{

     abstract double calculateArea();
     abstract double calculatePerimeter();
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1 , double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    double calculateArea() {
        double a = (side1+side2+side3)/2;
        return Math.sqrt(a * ( a - side1 ) * ( a - side2 ) * ( a - side3 ));
    }

    @Override
    double calculatePerimeter() {
        return side1+side2+side3;
    }
}

public class shapeAbstract {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(3 ,4 ,5);
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculatePerimeter());

        Shape circle1 = new Circle(4);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());


    }
}
