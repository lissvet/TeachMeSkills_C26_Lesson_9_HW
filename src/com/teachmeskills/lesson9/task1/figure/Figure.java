package com.teachmeskills.lesson9.task1.figure;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public String name;
    public double area;
    public double perimeter;

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
