
import java.util.Arrays;
import java.util.HashMap;

class June25FNAN {
    public static void main(String[] args) {
        // // int[] nums = new int[] { 2, 5, 1, 3, 4, 7 };
        // // System.out.println(Arrays.toString(nums));
        // // System.out.println(Arrays.toString(shuffleArray(nums, 3)));

        // System.out.println(maxSumOfSubArrayKBrute(new int[] { 2, 1, 5, 1, 3, 2 },

        // int[] nums = new int[] { 2, 7, 11, 15 };
        // int target = 9;
        // System.out.println(Arrays.toString(twoSumOptimized(nums, target)));

        // System.out.println(countSubArraysSumKOptimal(new int[] { 3, 4, 7, 2, -3, 1,
        // 4, 2, -6 }, 7));
        System.out.println(Arrays.toString(
                sumOfRows(
                        new int[][] {
                                new int[] { 1, 2, 3 },
                                new int[] { 4, 5, 6 },
                                new int[] { 7, 8, 9 }
                        })));
    }

    public static int[] sumOfRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] resArr = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[j][i];
            }
            resArr[i] = sum;
        }
        return resArr;
    }

    public static int countSubArraysSumKOptimal(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> prev = new HashMap<>();
        prev.put(0, 1);
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            int x = s - k;
            if (prev.containsKey(x)) {
                count += prev.get(k);
            }
            prev.put(s, prev.getOrDefault(s, 0) + 1);
            System.out.println(i + "" + prev);
        }
        return count;
    }

    public static int countSubArrays(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        int[] resArr = new int[2];
        HashMap<Integer, Integer> prev = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (prev.containsKey(need)) {
                resArr[0] = prev.get(need);
                resArr[1] = i;
                return resArr;
            }
            prev.put(nums[i], i);
        }
        return resArr;
    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] res = new int[n * 2];
        int x = 1;
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                res[i * 2] = nums[i];
            } else {
                res[i - n + x] = nums[i];
                x++;
            }
        }
        return res;
    }

    public static int maxSumOfSubArrayKBrute(int[] nums, int k) {
        int maxSum = 0;
        int n = nums.length;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++)
                sum += nums[j];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}