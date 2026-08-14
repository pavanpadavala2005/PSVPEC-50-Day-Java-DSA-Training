public class July07AN {
    public static void main(String[] args) {
        int i = 1234567891;
        int j = 1234567890;
        System.out.println(i + (j - i) / 2);
    }

    public static int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int idx = n;
        while (i <= j) {
            int mid = i + ((j - i) / 2);
            if (nums[mid] < target) {
                // ignore Left
                i = mid + 1;
            } else if (nums[mid] >= target) {
                // Ignore Right
                idx = mid;
                j = mid - 1;
            }

        }
        return idx;
    }
}
