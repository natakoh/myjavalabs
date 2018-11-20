package org.nmu.sau.KokhachykLabs.labFour;

public class Main {
    public static void main(String[] args) {
        MatrixManager manager;
        manager = new MatrixManager();
        Matrix matrix = manager.createMatrix(3,5);
        manager.displayMatrix(matrix);
        System.out.println("Sum: " + manager.getSum(matrix));
        System.out.println("Min element: " + manager.getMinElement(matrix));
        System.out.println("Max element: " + manager.getMaxElement(matrix));
    }
}
