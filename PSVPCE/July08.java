public class July08 {
    public static void main(String[] args) {
        // System.out.println(lastOccuacnce(
        // new int[] {
        // 1, 2, 3, 4, 4, 4, 4, 6
        // 5, 7, 7, 8, 8,
        // 5, 7, 7, 8, 8, 10
        // }, 0));
        int i = 2147395600;
        System.out.println((long) i / 512);
    }

    public static int lastOccuacnce(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int idx = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] > target) {
                j = mid - 1;
            } else {
                idx = mid;
                i = mid + 1;
            }
        }
        if (idx > -1 && nums[idx] == target) {
            return idx;
        } else {
            return -1;
        }
    }

    public static int searchInRotatedArray(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[i] < nums[mid]) { // Ignore Left Part
                if (nums[i] <= target && target <= nums[mid]) { // i <= t <= mid --> search in left
                    j = mid - 1;
                } else { // --> search in right Half
                    i = mid + 1;
                }
            } else if (nums[mid] < nums[j]) { // Ignore Right Part
                if (nums[mid] <= target && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}