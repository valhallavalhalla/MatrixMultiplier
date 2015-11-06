/**
 * Created by andrii on 06.11.15.
 */
public class MatrixMultiplier {

    private static Matrix resultMatrix = null;

    public static Matrix multiple(Matrix matrixOne, Matrix matrixTwo) {
        if (checkMultiplicationPossibility(matrixOne, matrixTwo)) {
            int columns = matrixOne.getRows();
            int rows = matrixTwo.getColumns();
            int result[][] = new int[columns][rows];

            for (int column = 0; column < columns; column++) {
                for (int row = 0; row < rows; row++) {
                    for (int counter = 0; counter < matrixOne.getColumns(); counter++) {
                        result[column][row] += matrixOne.getMatrix()[counter][column]
                                * matrixTwo.getMatrix()[row][counter];
                    }
                }
            }
            resultMatrix = new Matrix(matrixOne.getColumns(), matrixTwo.getRows(), result);
            return resultMatrix;
        } else {
            return resultMatrix;
        }
    }

    private static boolean checkMultiplicationPossibility(Matrix matrixOne, Matrix matrixTwo) {
        if (matrixOne.getColumns() != matrixTwo.getRows()) {
            System.out.println("Value of columns in first matrix isn't equals to value of rows in second matrix.");
            System.out.println("Multiplication is impossible.");
            return false;
        } else {
            return true;
        }
    }

}
