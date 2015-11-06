import java.util.Arrays;

/**
 * Created by andrii on 06.11.15.
 */
public class Matrix {

    private int[][] matrix;
    private int columns;
    private int rows;
    Matrix(int columns, int rows, int[][] values) {
        this.columns = columns;
        this.rows = rows;
        matrix = values.clone();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }


    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

}
