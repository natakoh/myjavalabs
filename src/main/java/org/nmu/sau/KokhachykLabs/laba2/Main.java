package org.nmu.sau.KokhachykLabs.laba2;

public class Main {

    public static void main(String[] args){
        int rows = 3, columns = 5;
        MatrixManager manager;
        manager= new MatrixManager();
        Matrix matrix = manager.createMatrix(rows, columns);

        manager.displayMatrix(matrix);

        System.out.println("Sum: " + manager.getSum(matrix));
        System.out.println("Min element: " + manager.getMinElement(matrix));
        System.out.println("Max element: " + manager.getMaxElement(matrix));
    }
}