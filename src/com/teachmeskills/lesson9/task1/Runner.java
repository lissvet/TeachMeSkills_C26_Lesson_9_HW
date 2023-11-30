package com.teachmeskills.lesson9.task1;

import com.teachmeskills.lesson9.task1.figure.*;
/** Improve the task with shapes
 * Use the Sealed modifier for the Shape class.**/
public class Runner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        Triangle triangle = new Triangle(5, 9, 17);
        Circle circle = new Circle(6);
        Triangle triangle2 = new Triangle(55, 32, 50);
        Circle circle2 = new Circle(71);

        Figure[] figure = new Figure[5];
        figure[0] = rectangle;
        figure[1] = triangle;
        figure[2] = circle;
        figure[3] = triangle2;
        figure[4] = circle2;

        for(Figure counter : figure){
            System.out.println("figure name: " + counter.name + ". figure area: " + counter.area + " figure perimeter: " + counter.perimeter);
        }
        System.out.println("Sum of perimeters of all given figures: " + (figure[0].perimeter + figure[1].perimeter + figure[2].perimeter + figure[3].perimeter + figure[4].perimeter));
    }

}
