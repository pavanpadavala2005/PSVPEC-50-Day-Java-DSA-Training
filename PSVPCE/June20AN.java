
public class June20AN {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 3, 4 };
        // roatateRightByK(arr, 6);
        // System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] nums) {
        int i = 0;
        for (int j = 0; i < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    public static void roatateRightByK(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rev(nums, n - k, n - 1);
        rev(nums, 0, n - k - 1);
        rev(nums, 0, n - 1);
        // int n = nums.length;
        // k = k % n;
        // for (int i = 0; i < k; i++) {
        // System.out.println("Run - " + (i + 1));
        // int last = nums[n - 1];
        // for (int j = n - 1; j >= 1; j--) {
        // nums[j] = nums[j - 1];
        // }
        // nums[0] = last;
        // }
    }

    public static void rev(int[] nums, int i, int j) {
        // int i = 0;
        // int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[n - i - 1] = arr[i];
        }
        return res;
    }
}
