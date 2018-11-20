/*package org.nmu.sau.KokhachykLabs.laba2;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest {
    private int row = 2;
    private int column = 2;

    @Test
    public void getSum() {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = new Matrix();
        matrix.setRows(row);
        matrix.setColumns(column);
        int[][] matrixTest = new int[row][column];
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                matrixTest[i][j] = 1;
            }
        }
        matrix.setArr(matrixTest);
        int summa = matrixManager.getSum(matrix);
        assertEquals("Sum of elements must be 4", 4, summa);
    }
    @Test
    public void getMinElement() {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = new Matrix();
        matrix.setRows(row);
        matrix.setColumns(column);
        int[][] matrixTest = {{1, 2}, {3, 4}};
        matrix.setArr(matrixTest);
        assertEquals(1, matrixManager.getMinElement(matrix));
    }
    @org.junit.Test
    public void getMaxElement() {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = new Matrix();
        matrix.setRows(row);
        matrix.setColumns(column);
        int[][] matrixTest = {{1, 2}, {3, 4}};
        matrix.setArr(matrixTest);
        assertEquals(4, matrixManager.getMaxElement(matrix));
    }
} */

package org.nmu.sau.KokhachykLabs.laba2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest {
    private static final int ROWS_NUMBER = 2;
    private static final int COLUMNS_NUMBER = 2;
    private static Matrix matrix = new Matrix();
    private static MatrixManager matrixManager = new MatrixManager();

    @Before
    public void createBaseMatrix() {
        matrix.setRows(ROWS_NUMBER);
        matrix.setColumns(COLUMNS_NUMBER);
        int[][] matrixTest = {{1, 2}, {3, 4}};
        matrix.setArr(matrixTest);
    }

    @Test
    public void getSum() {
        assertEquals(10, matrixManager.getSum(matrix));
    }

    @Test
    public void getMinElement() {
        assertEquals(1, matrixManager.getMinElement(matrix));
    }

    @org.junit.Test
    public void getMaxElement() {
        assertEquals(4, matrixManager.getMaxElement(matrix));
    }
}