
import java.util.Scanner;

public class June20FN {
    public static void main(String[] args) {
    }

    public static int[] sumQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            // int sum = 0;
            // for (int j = queries[i][0]; j <= queries[i][1]; j++) {
            // sum += nums[i];
            // }
            // res[i] = sum;
            res[i] = rangeSum(nums, queries[i][0], queries[i][1]);
        }
        return res;
    }

    public static int prefixRangeSum(int[] nums, int L, int R) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        if (L > 0)
            return prefix[R] - prefix[L - 1];
        return prefix[R];
    }

    public static int rangeSum(int[] nums, int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++)
            sum += nums[i];
        return sum;
    }

    public static void jagggedArrayInput() {
        // ! Taking Jagged Array input
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter Num cols for Row - " + i);
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter R-%d C-%d : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        matrixRepresentation(arr);
    }

    public static void matrixRepresentation(int[][] arr) {
        // Jagged Array
        // int[][] arr = new int[][] {
        // new int[] { 1, 2, 3 },
        // new int[] { 4 },
        // new int[] { 7, 8, 9, 7, 8, 9 }
        // };
        int rows = arr.length;
        // int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
