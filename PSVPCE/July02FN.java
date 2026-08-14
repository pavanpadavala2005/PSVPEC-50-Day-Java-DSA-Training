
import java.util.Arrays;

// ! Batch-4

public class July02FN {
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        System.out.println(4 ^ 2 ^ 2 ^ 6);
    }

    public static int missingValueOptimal(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= i + 1;
            res ^= nums[i];
        }
        return res;
    }

    public static int duplicateElement(int[] nums) {
        int res = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    res = nums[i];
                    return res;
                }
            }
        }
        return res;
    }

    public static int duplicateNumber(int[] nums) {
        Arrays.sort(nums);
        int res = -1;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++)
            if (nums[i] == nums[i + 1])
                return nums[i];
        return res;
    }

    public static int duplicateNumberOptimal(int[] nums) {
        int n = nums.length;
        int[] resArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (resArr[nums[i]] == -1)
                return nums[i];
            else
                resArr[nums[i]] = -1;
        }
        return -1;
    }
}