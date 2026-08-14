
public class July17FN {
    public static int rowWithMaxOnes(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int idx = -1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 1)
                    ctr++;
            }
            if (ctr > max) {
                max = ctr;
                idx = i;
            }
        }
        return idx;
    }

    public static boolean seaechIn2DMatrixII(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;
        int i = 0;
        int j = m - 1;
        while (j >= 0 && i <= n - 1) {
            int val = nums[i][j];
            if (val == target)
                return true;
            else if (val < target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] > nums[1])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;
        int i = 1;
        int j = n - 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid - 1] < nums[mid]) // !if INcreasing towards Right
                i = mid + 1;
            else // !if INcreasing towards Left
                j = mid - 1;
        }
        return -1;
    }
}