
import java.util.HashSet;

public class July04FN {
    public static void main(String[] args) {

    }

    public static int longestConsecutiveSequenceOptimal(int[] nums) {
        HashSet<Integer> prev = new HashSet<>();
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            prev.add(nums[i]);
            int elem = nums[i];
            int ctr = 0;
            while (prev.contains(elem)) {
                elem++;
                ctr++;
            }
            longest = Math.max(longest, ctr);
        }
        return longest;
    }

    public static int longestConsecutiveSequence(int[] nums) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int elem = nums[i];
            int ctr = 0;
            while (linearSearch(nums, elem) == true) {
                ctr++;
                elem++;
            }
            longest = Math.max(longest, ctr);
        }
        return longest;
    }

    public static boolean linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return true;
        return false;
    }
}