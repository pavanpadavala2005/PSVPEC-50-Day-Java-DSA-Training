import java.util.HashMap;

public class June24Test {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(t[]woSumOptimized(new int[] { 3, 2, 4 },
        // 6)));
        // System.out.println(maxSubArraySum(new int[] {
        // 100, 200, 300, 400 }, 2));
        // System.out.println(maxSubArraySum(new int[] {
        // 2, 1, 5, 1, 3, 2 }, 3));
        shuffleArray(new int[] { 2, 5, 1, 3, 4, 7 }, 3);
    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] resArr = new int[2 * n];
        int x = 1;
        for (int i = 0; i < 2 * n; i++) {
            if (i <= n - 1) {
                System.out.println(i + "-->" + (2 * i));
            } else {
                System.out.println(i + "-->" + (i % n + x));
                x++;
            }
        }
        return resArr;
    }

    public static int majorityElement(int[] nums) {
        int cand = -1;
        int ctr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ctr == 0) {
                cand = nums[i];
                ctr = 1;
            } else if (nums[i] == cand)
                ctr++;
            else
                ctr--;
        }
        return cand;
    }

    public static int maxSubArraySumBrute(int[] nums, int k) {
        int maxSum = 0;
        int n = nums.length;
        for (int i = 0; i <= n - 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++)
                sum += nums[j];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // ! code for Optized approach
    public static int maxSubArraySumOptimized(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i + 1 == k)
                max = Math.max(sum, max);
            if (i >= k) {
                sum -= nums[i - k];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> needMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (needMap.containsKey(need)) {
                return new int[] { needMap.get(need), i };
            }
            needMap.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSumBrute(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}