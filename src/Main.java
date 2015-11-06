import java.util.Arrays;

/**
 * Created by andrii on 06.11.15.
 */
public class Main {

    public static void main(String[] args) {
        int mtx1[][] = {
                {2, 4},
                {-5, 3},
                {5, 3}
        };
        int mtx2[][] = {
                {34, 4, 0},
                {-2, 53, -12},
                {3, 12, 37},
                {2, 0, 35}
        };
        Matrix matrixOne = new Matrix(3, 2, mtx1);
        matrixOne.setMatrix(mtx1);
        Matrix matrixTwo = new Matrix(4, 3, mtx2);
        System.out.println("***First matrix***");
        System.out.println(Arrays.deepToString(matrixOne.getMatrix()));
        System.out.println("***Second matrix***");
        System.out.println(Arrays.deepToString(matrixTwo.getMatrix()));
        System.out.println("***Result***");
        System.out.println(Arrays.deepToString(MatrixMultiplier.multiple(matrixOne, matrixTwo).getMatrix()));
    }

}
