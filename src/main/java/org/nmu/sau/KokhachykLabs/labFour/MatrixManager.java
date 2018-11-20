package org.nmu.sau.KokhachykLabs.labFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixManager {
    public static final int RANDOM_BORDER = 100;

    public static Matrix createMatrix(int rows, int columns) {
        Matrix matrix = new Matrix();
        matrix.setRows(rows);
        matrix.setColumns(columns);
        fillMatrix(matrix);
        return matrix;
    }

    public int getSum(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                sum += matrix.getArr().get(i).get(j);
            }
        }
        return sum;
    }

    public int getMinElement(Matrix matrix) {
        int minElement = matrix.getArr().get(0).get(0);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                int tmpMinElement = matrix.getArr().get(i).get(j);
                if (minElement > tmpMinElement) {
                    minElement = tmpMinElement;
                }
            }
        }
        return minElement;
    }

    public int getMaxElement(Matrix matrix) {
        int maxElemnt = matrix.getArr().get(0).get(0);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                int tmpMaxElement = matrix.getArr().get(i).get(j);
                if (maxElemnt < tmpMaxElement) {
                    maxElemnt = tmpMaxElement;
                }
            }
        }
        return maxElemnt;
    }

    public static void fillMatrix(Matrix matrix) {
        Random random = new Random();
        List<List<Integer>> matrixData = new ArrayList<List<Integer>>(matrix.getRows());
        for (int i = 0; i < matrix.getRows(); i++) {
            matrixData.add(new ArrayList<Integer>(matrix.getColumns()));
            for (int j = 0; j < matrix.getColumns(); j++) {
                matrixData.get(i).add(random.nextInt(RANDOM_BORDER));
            }
            matrix.setArr(matrixData);
        }
    }
        public void displayMatrix (Matrix matrix){
            System.out.print(matrix.getAuthor() + "\n");
            for (int i = 0; i < matrix.getRows(); i++) {
                for (int j = 0; j < matrix.getColumns(); j++) {
                    System.out.print(matrix.getArr().get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

