import java.util.Arrays;

public class Mat {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 4, 5, 6 },
                new int[] { 7, 8, 9 }
        };
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {

            }
        }
        printMatrix(res);
        System.out.println(Arrays.deepToString(res));
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(0 + " ");
            }
            for (int j = i + 1; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}