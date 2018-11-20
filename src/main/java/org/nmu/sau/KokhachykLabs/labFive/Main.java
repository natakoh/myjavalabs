package org.nmu.sau.KokhachykLabs.labFive;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\l.txt";
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createMatrix(5, 5);

        MatrixTextFile matrixTextFiles = new MatrixTextFile();
        matrixTextFiles.write(matrix, filePath);
        Matrix matrixFromFIle = matrixTextFiles.read(filePath);

        matrixManager.displayMatrix(matrixFromFIle);
        System.out.println("sum is " + matrixManager.getSum(matrixFromFIle) +
                ", min element is " + matrixManager.getMinElement(matrixFromFIle) +
                ", max element is " + matrixManager.getMaxElement(matrixFromFIle));
    }
}
