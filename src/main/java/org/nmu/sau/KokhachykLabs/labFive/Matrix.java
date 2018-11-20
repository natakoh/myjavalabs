package org.nmu.sau.KokhachykLabs.labFive;

import java.util.List;
import java.util.Objects;

public class Matrix {

    int rows, columns;
    int[][] arr;

    private List<List<Integer>> list;
    private String author = "Kokhanchyk N.";
    public void setList(List<List<Integer>> list) {
        this.list = list;
    }

    public List<List<Integer>> getList() {
        return list;
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public int[][] getArr() {
        return arr;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }
    public void setArr(int[][] arr) {
        this.arr = arr;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rows == matrix.rows &&
                columns == matrix.columns &&
                Objects.equals(author, matrix.author) &&
                Objects.equals(list, matrix.list);
    }
}
