
public class June23FN {
    public static void main(String[] args) {
        System.out.println(Math.random() * 100);
    }

    public static void printJaggedmatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}