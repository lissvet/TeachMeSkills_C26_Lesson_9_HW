package com.teachmeskills.lesson9.task1.figure;

public final class Circle extends Figure {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        name = "Circle";
    }

    public double calculateArea(){
        double area;
        area = radius * radius * 3.14;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = radius * 3.14 * 2;
        return perimeter;
    }

}
