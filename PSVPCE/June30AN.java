
import java.util.Arrays;
import java.util.HashMap;

public class June30AN {
    public static void main(String[] args) {
        // printJaggedArray(pascalTriangle(6));
        // pascalTriangleOptimized(6);
        System.out.println(longestSubArrayOptimal(new int[] { 10, 5, 2, 7, 1, -10 }, 15));
    }

    // ! Generating Sub Arrays
    public static void generateSubArrays(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j =i; j <arr.length; j++){
                int[]
            }
        }
    }

    public static int longestSubArrayOptimal(int[] nums, int k) {
        HashMap<Integer, Integer> prev = new HashMap<>();
        int sum = 0;
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)
                longest = i + 1;
            int x = sum - k;
            if (prev.containsKey(x)) {
                longest = Math.max(longest, i - prev.get(x));
            }
            if (!prev.containsKey(sum)) {
                prev.put(sum, i);
            }
        }
        return longest;
    }

    public static int longestSubArray(int[] nums, int k) {
        int longest = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }
        return longest;
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

    public static void pascalTriangleOptimized(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ncr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascalTriangle(int n) {
        // ! Pascal Triangle Structure generation
        int[][] resArr = new int[n][];
        for (int i = 0; i < n; i++)
            resArr[i] = new int[i + 1];
        // ! Filling the Pascal triangle using Two Loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < resArr[i].length; j++) {
                if (j == 0 || j == i) {
                    // ! put 1 at start(0) and end(last)
                    resArr[i][j] = 1;
                } else {
                    // ! take from Previous Iteration
                    resArr[i][j] = resArr[i - 1][j - 1] + resArr[i - 1][j];
                }
            }
        }
        return resArr;
    }

    public static void printJaggedArray(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
