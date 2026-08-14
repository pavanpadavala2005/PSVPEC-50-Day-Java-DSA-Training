
import java.util.Arrays;

public class June19FNAN {
    public static void main(String[] args) {
        // int[] nums = new int[] { 10, 20, 2, 4, 6, 8 };
        // int[] nums = new int[] { 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
        // System.out.println(maxConsecutiveOnes(nums));
        // int[] arr = { 4, 5, 2, 10 };
        // int[] ans = nextgreaterelement(arr);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(safeHouse(new int[] { 1, 2, 3, 4, 6 }));
        // System.out.println(Arrays.toString(reverseArrayRange(new int[] { 1, 2, 3, 4,
        // 5, 6, 7, 8, 9, 10 }, 2, 6)));
        // int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        // reverse(nums, 2, 6);
        // System.out.println(Arrays.toString(nums));

        int[] arr = new int[] { 1, 2, 3, 4 };
        rightRotateByKOptimal(arr, 2);
        System.out.println("Result Array : " + Arrays.toString(arr));
    }

    public static int[] moveZerosToEndBrute(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                res[i] = nums[i];
                idx++;
            }
        }
        return res;
    }

    public static void moveZerosToEndOptimal(int[] nums) {
        // Inplace Swapping
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void rightRotateByKOptimal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, 0, n - 1);
    }

    public static void rightRotateByK(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            System.out.println("Run - " + (i + 1));
            int last = nums[n - 1];
            for (int j = n - 1; j >= 1; j--)
                nums[j] = nums[j - 1];
            nums[0] = last;
        }
    }

    public static int[] reverseArr(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[i] = nums[n - i - 1];
        }
        return res;
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static int safeHouse(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += nums[j];
            for (int k = i + 1; k < n; k++)
                rightSum += nums[k];
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public static int[] nextgreaterelement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[i]) {
                    elem = arr[j];
                    break;
                }
            }
            result[i] = elem;
        }
        return result;
    }

    public static int secondLargest(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int largest = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest)
                return nums[i];
        }
        return -1;
    }

    public static int maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                largest = Math.max(largest, count);
                count = 0;
            }
        }
        largest = Math.max(largest, count);
        return largest;
    }

    public static int[] reverseArrayRange(int[] nums, int st, int ed) {
        int n = nums.length;
        int[] res = new int[n];
        // Copy first Unchange part
        for (int i = 0; i < st; i++) {
            res[i] = nums[i];
        }
        // Reverse Arr form ed --> st
        for (int j = ed; j >= st; j--) {
            int length = ed - st + 1;
            res[j] = nums[length - j - 1];
        }
        // Reverse 2nd Unchanged Part
        for (int k = ed; k < n; k++) {
            res[k] = nums[k];
        }
        return res;
    }
}