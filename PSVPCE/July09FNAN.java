public class July09FNAN {
    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println((long) x * x);
    }

    public static int findMinIdx(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            // if (nums[mid] > nums[j])
            // i = mid + 1;
            // else
            // j = mid;
            if (nums[i] > nums[mid])
                i = mid;
            else if (nums[j] >= nums[mid])
                j = mid - 1;
        }
        return i;
    }

    public static int findMinimum(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[i] <= nums[mid]) // left is Sorted Ignore
                i = mid + 1;
            else if (nums[mid] <= nums[j]) // Right is Sorted Ignore
                j = mid - 1;
        }
        return i;
    }
}
