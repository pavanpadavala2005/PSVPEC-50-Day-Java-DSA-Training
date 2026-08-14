public class July07FN {
    public static void main(String[] args) {
        int[] arr = new int[] { -1, 0, 3, 5, 9, 12 };
        System.out.println(bs(arr, 9, 0, arr.length - 1));
    }

    public static int bs(int[] arr, int target, int i, int j) {
        if (i > j)
            return -1;
        int mid = i + (j - i) / 2;
        if (arr[mid] < target)
            return bs(arr, target, mid + 1, j);
        else if (arr[mid] > target)
            return bs(arr, target, i, mid - 1);
        else
            return mid;
    }

    public static int binarySearch(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > target)
                j = mid - 1;
            else if (nums[mid] < target)
                i = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}