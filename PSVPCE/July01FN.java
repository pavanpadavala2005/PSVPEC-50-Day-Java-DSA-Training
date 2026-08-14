
import java.util.*;

public class July01FN {
    public static void main(String[] args) {
        // System.out.println(kadanesAlgorithmOptimal(new int[] {
        // 2, 3, -8, 7, -1, 2, 3
        // // -2, -4
        // }));

        int[] arr = new int[] {
                // -1, 0, 1, -1, -1, 1, 0, 0, 2, -2, -2, 0, 1, -1
                -1, 0, 1, 2, -1, -4
        };
        List<List<Integer>> lis = threeSumOptimal(arr, 0);
        for (List<Integer> l : lis) {
            System.out.println(l);
        }
        // System.out.println(threeSumOptimal(arr, 0));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(
        // threeSumbetter(new int[] {
        // // -1, 0, 1, 2, -1, -4
        // -1, 0, 1, -1, -1, 1, 0, 0, 2, -2, -2, 0, 1, -1
        // }, 0));
    }

    // ! Take 4 Sum as Home Work//

    // ! Sort colors Problem
    public static void sortColorsBrute(int[] nums) {
        Arrays.sort(nums);
    }

    public static void sortColorsBetter(int[] nums) {
        // Count how many number of zeros ones and twos are there and fill them back in
        // the original array

        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zeros++;
            else if (nums[i] == 1)
                ones++;
            else
                twos++;
        }
        int ptr = 0;
        for (int i = 0; i < zeros; i++) {
            nums[ptr] = 0;
            ptr++;
        }
        for (int j = 0; j < ones; j++) {
            nums[ptr] = 1;
            ptr++;
        }
        for (int k = 0; k < twos; k++) {
            nums[ptr] = 2;
            ptr++;
        }
    }

    // ! Duch National Flag Algorithm
    public static void sortColorsOptimal(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Utitlity Swapping Method
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // ! Optimal Approach
    public static List<List<Integer>> threeSumOptimal(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // ! consider 1st Occuerence of ELement and skip After that
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    ArrayList<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    resList.add(triplet);
                    // ! After finding Sum skip that value for J pointer move Right
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    // ! After finding Sum skip that value for K pointer move Left
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return resList;
    }

    public static List<List<Integer>> threeSumBrute(int[] nums, int target) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        ArrayList<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> threeSumbetter(int[] nums, int target) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> reqSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int req = -(nums[i] + nums[j]);
                if (reqSet.contains(req)) {
                    ArrayList<Integer> resList = new ArrayList<>(List.of(nums[i], nums[j], req));
                    Collections.sort(resList);
                    set.add(resList);
                }
                reqSet.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }

    public static int kadanesAlgorithmOptimal(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            sum = Math.max(0, sum);
        }
        return maxSum;
    }

    public static int kadanesAlgorithmBrute(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    sum += nums[j];
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }
        return maxSum;
    }

    public static void generateSubArrays(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printSubArray(nums, i, j);
            }
        }
        System.out.println("Count : " + count);
    }

    public static boolean printSubArray(int[] nums, int start, int end) {
        System.out.print("[");
        while (start <= end) {
            System.out.print(nums[start] + ",");
            start++;
        }
        System.out.print("]");
        System.out.println();
        return true;
    }
}
