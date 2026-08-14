
import java.util.Arrays;

public class july15FN {
    public static void main(String[] args) {
        int[] nums = new int[] {
                12, 34, 67, 90
        };
        int mi = Integer.MIN_VALUE;
        int sm = 0;
        for (int elem : nums) {
            mi = Math.max(mi, elem);
            sm += elem;
        }
        for (int i = mi; i <= sm; i++) {
            System.out.println(i + " --> " + bookAllocationPossible(nums, i, 2));
        }
    }

    public static boolean bookAllocationPossible(int[] nums, int limit, int k) {
        int ctr = 1; // Denotes Students
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prev + nums[i] <= limit)
                prev += nums[i];
            else {
                ctr++; // ALlocate New Student
                prev = nums[i];
            }
        }
        return ctr >= k;
    }

    public static boolean cowsPossible(int[] nums, int d, int k) {
        int ctr = 1;
        int last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (d <= nums[i] - last) {
                ctr++;
                last = nums[i];
            }
        }
        if (ctr >= k)
            return true;
        else
            return false;
    }

    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 1;
        int j = nums[n - 1];
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (cowsPossible(nums, mid, k))
                i = mid + 1;
            else
                j = mid - 1;
        }
        return j;
    }
}
