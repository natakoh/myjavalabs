package org.nmu.sau.KokhachykLabs.labFive;


import java.util.Random;

public class MatrixManager {

    public static Matrix createMatrix(int rows, int columns) {
        Matrix matrix = new Matrix();
        matrix.rows = rows;
        matrix.columns = columns;

        fillMatrix(matrix, rows, columns);
        return matrix;
    }

    public int getSum(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                sum += matrix.arr[i][j];
            }
        }
        return sum;
    }

    public int getMinElement(Matrix matrix) {
        int minElemnt = matrix.arr[0][0];

        for (int i = 0; i < matrix.rows; i++) {

            for (int j = 0; j < matrix.columns; j++) {
                if (minElemnt > matrix.arr[i][j]) {
                    minElemnt = matrix.arr[i][j];
                }
            }
        }
        return minElemnt;
    }

    public int getMaxElement(Matrix matrix) {
        int maxElemnt = matrix.arr[0][0];

        for (int i = 0; i < matrix.rows; i++) {

            for (int j = 0; j < matrix.columns; j++) {
                if (maxElemnt < matrix.arr[i][j]) {
                    maxElemnt = matrix.arr[i][j];
                }
            }
        }
        return maxElemnt;
    }

    public static void fillMatrix(Matrix matrix, int rows, int columns) {
        Random random = new Random();

        matrix.arr = new int[rows][columns];

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                matrix.arr[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public void displayMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                System.out.print(matrix.arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.rows; i++) {

            for (int j = 0; j < matrix.columns; j++) {
                System.out.print(matrix.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}