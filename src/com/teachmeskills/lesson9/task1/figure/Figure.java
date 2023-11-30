package com.teachmeskills.lesson9.task1.figure;

import com.teachmeskills.lesson9.task1.figure.Circle;
import com.teachmeskills.lesson9.task1.figure.Rectangle;
import com.teachmeskills.lesson9.task1.figure.Triangle;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public String name;
    public double area;
    public double perimeter;

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
