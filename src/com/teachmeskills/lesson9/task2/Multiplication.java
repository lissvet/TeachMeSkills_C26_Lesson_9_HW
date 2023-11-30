package com.teachmeskills.lesson9.task2;

public class Multiplication {

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int[][] resultMatrix = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    resultMatrix[i][j] = resultMatrix[i][j] + (mat1[i][k] *  mat2[k][j]);
                }
            }
        }
        return resultMatrix;
    }

}
