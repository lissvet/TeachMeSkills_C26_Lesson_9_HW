package com.teachmeskills.lesson9.task2;

/**Improve a task with matrix multiplication.
 * Create a class Utils. In this class, create a static method to output a matrix to the screen using System.out.println.
 * The method should take a two-dimensional array as input and return nothing as output.
 * Use this static method in the class to solve the matrix multiplication problem.
 * Use this static method to print a matrix to the screen three times - print the first matrix, print the second matrix, print the result.**/
public class Runner {

public static void main(String[] args) {
        int[][] matrix1 = {{1,0,0,0},
                           {0,1,0,0},
                           {0,0,0,0}};
        int[][] matrix2 = {{1,2,3},
                           {1,1,1},
                           {0,0,0},
                           {2,1,0}};
        int[][] matrixResult = Multiplication.multiplyMatrices(matrix1, matrix2);
        System.out.println("First matrix: ");
        Utils.showMatrix(matrix1);
        System.out.println("Second matrix: ");
        Utils.showMatrix(matrix2);
        System.out.println("Result matrix: ");
        Utils.showMatrix(matrixResult);
    }

}
