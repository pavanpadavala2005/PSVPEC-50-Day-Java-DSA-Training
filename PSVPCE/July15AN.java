public class July15AN {
    public static void main(String[] args) {
        System.out.println(shipPackages(new int[] {
                // 3, 2, 2, 4, 1, 4
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                // 1, 2, 3, 1, 1
        },
                5));
    }

    public static boolean shippingPossible(int[] nums, int capcity, int days) {
        int day = 1;
        int weight = 0;
        for (int i = 0; i < nums.length; i++) {
            if (weight + nums[i] > capcity) {
                day++;
                weight = nums[i];
            } else {
                weight += nums[i];
            }
        }
        System.out.print("Days : " + day + "  Capacity :");
        return day <= days;
    }

    public static int shipPackages(int[] nums, int days) {
        int mx = Integer.MIN_VALUE;
        int sm = 0;
        for (int elem : nums) {
            mx = Math.max(mx, elem);
            sm += elem;
        }
        // for (int i = mx; i <= sm; i++) {
        // System.out.println(i + " ==> " + shippingPossible(nums, i, days));
        // }
        // return -1;
        int i = mx;
        int j = sm;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            System.out.println(shippingPossible(nums, mid, days));
            if (shippingPossible(nums, mid, days))
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }
}
