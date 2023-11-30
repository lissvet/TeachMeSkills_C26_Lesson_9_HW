package com.teachmeskills.lesson9.task1.figure;

public non-sealed class Rectangle extends Figure {

    public double height;
    public double base;
    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
        name = "Rectangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        double area;
        area = height * base;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = (height * base) * 2;
        return perimeter;
    }

}
