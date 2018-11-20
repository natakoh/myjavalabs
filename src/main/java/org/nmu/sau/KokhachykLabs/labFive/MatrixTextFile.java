package org.nmu.sau.KokhachykLabs.labFive;

import com.google.gson.Gson;

import java.io.*;

public class MatrixTextFile {
    private Gson gson = new Gson();

    public void write(Matrix matrix, String filePath) {
        try {
            Writer writer = new FileWriter(filePath);
            gson.toJson(matrix, writer);
            writer.flush();
        } catch (Exception e) {
            System.out.println("Please check the file path");
        }
    }

    public Matrix read(String filePath) {
        Matrix matrix = new Matrix();
        try {
            matrix = gson.fromJson(new FileReader(filePath), Matrix.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
