package org.nmu.sau.KokhachykLabs.labFour;
import java.util.List;

public class Matrix {
    int rows, columns;
    String author = "Kokhanchyk";
    List<List<Integer>> arr;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setArr(List<List<Integer>> arr) {
        this.arr = arr;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public List<List<Integer>> getArr() {
        return arr;
    }
}
