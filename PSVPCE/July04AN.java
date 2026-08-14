
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class July04AN {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
    }

    public static int countSubArrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            p ^= nums[i];
            int x = p ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(p, map.getOrDefault(p, 0) + 1);
            // if (!map.containsKey(p)) {
            // map.put(p, 1);
            // } else {
            // int val = map.get(p);
            // map.put(p, val + 1);
            // }
        }
        return count;
    }
}
