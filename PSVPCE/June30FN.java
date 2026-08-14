import java.util.Arrays;

class June30FN {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 3, 4 };
        // int[] nums = new int[] { 20, 30, 40 };

        // nums = arr;
        // System.out.println(Arrays.toString(nums));
        // int[][] matrix = new int[][] {
        // new int[] { 1, 2, 3 },
        // new int[] { 4, 5, 6 },
        // new int[] { 7, 8, 9 }
        // };
        // printMatrix(matrix);
        // System.out.println("_____________-");
        // transposeMatrix(matrix);
        // printMatrix(matrix);
        // printJaggedArray(
        // pascalTriangle(10));
        // System.out.println(getColumn(6, 4));
        System.out.println(Arrays.toString(
                getRow(3)));
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = n; i > 1; i--)
            res *= i;
        return res;
    }

    public static int ncr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }

    public static int getColumn(int row, int col) {
        return ncr(row - 1, col - 1);
    }

    public static int[] getRow(int n) {
        n = n + 1;
        int[] resArr = new int[n];
        for (int i = 1; i <= n; i++) {
            resArr[i - 1] = getColumn(n, i);
        }
        return resArr;
    }

    public static int[][] pascalTriangle(int n) {
        // ! Pascal Triangle Structure generation
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
        }
        // ! Pascal Triangle Formation
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1; // ! Keep 1 at 0 idx
            arr[i][i] = 1; // ! keep 1 at last idx also
            for (int j = 1; j < arr[i].length - 1; j++) {
                // ! every col ex 2 col add prev row 1 col + prev row 2 col
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }

    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] resMatrix = new int[n][n];
        int x = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resMatrix[j][x] = mat[i][j];
            }
            x--;
        }
        return resMatrix;
    }

    // ! For Printing Pascal triangle
    public static void printJaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Rotate90Deg {
    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] mat) {
        transposeMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            reverse(mat[i]);
        }
    }
}