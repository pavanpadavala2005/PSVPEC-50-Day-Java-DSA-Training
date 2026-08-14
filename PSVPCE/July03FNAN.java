import java.util.*;

public class July03FNAN {
    public static void main(String[] args) {

    }

    public static int longestConsecutiveSequenceOptimal(int[] nums) {
        HashSet<Integer> elems = new HashSet<>();
        int longest = 0;
        int n = nums.length;
        for (int i : nums)
            elems.add(i);
        for (int i = 0; i < n; i++) {
            int elem = nums[i];
            int ctr = 0;
            while (!elems.isEmpty() && elems.contains(elem)) {
                ctr++;
                elem++;
            }
            longest = Math.max(ctr, longest);
        }
        return longest;
    }

    public static int longestConsecutiveSequenceBetter(int[] nums) {
        int longest = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int ctr = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1])
                continue;
            if (nums[i] + 1 == nums[i + 1]) {
                ctr++;
                longest = Math.max(longest, ctr);
            } else {
                ctr = 1;
            }
        }
        return longest;
    }

    public static int longestConsecutiveSequenceBrute(int[] nums) {
        int longest = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int elem = nums[i];
            int ctr = 1;
            while (linearSearch(nums, elem)) {
                ctr++;
                elem++;
            }
            longest = Math.max(longest, ctr);
        }
        return longest;
    }

    public static boolean linearSearch(int[] nums, int elem) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == elem)
                return true;
        return false;
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // Loop to find the dip in the Array
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        // If there is no dip just stop the process
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        // if there is a dip and we should swap with smaller of greatest elements on
        // right side
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, idx, i);
                break;
            }
        }
        // finally reverse the part of idx+1 to last and return
        reverse(nums, idx + 1, n - 1);

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static int longestSumSubArrayOptimal(int[] nums, int k) {
        int longest = 0;
        int sum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k)
                longest = Math.max(longest, i + 1);
            int x = sum - k;
            if (prefix.containsKey(x)) {
                longest = Math.max(longest, i - prefix.get(x));
            }
            if (!prefix.containsKey(sum))
                prefix.put(sum, i);
        }
        return longest;
    }

    public static int longestSumSubArrayBrute(int[] nums, int k) {
        int longest = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    int len = j - i + 1;
                    longest = Math.max(longest, len);
                }
            }
        }
        return longest;
    }

    public static void mergeSortedArrays(int[] nums1, int[] nums2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
