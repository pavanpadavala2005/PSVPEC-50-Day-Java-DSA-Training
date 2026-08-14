public class July11AN {
    public static void main(String[] args) {
        System.out.println(
                isBoquetsPossible(new int[] {
                        // 1, 10, 3, 10, 2
                        7, 7, 7, 7, 12, 7, 7
                }, 11, 2, 3));
    }

    public static boolean isBoquetsPossible(int[] nums, int day, int m, int k) {
        int ctr = 0, bqt = 0;
        for (int i : nums) {
            if (i <= day)
                ctr++;
            else {
                bqt += ctr / k;
                ctr = 0;
            }
        }
        if (ctr > 0)
            bqt += ctr / k;
        if (bqt >= m)
            return true;
        return false;
    }

    public static boolean isPossible(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int i : nums)
            sum += Math.ceilDiv(i, d);
        if (sum <= threshold)
            return true;
        else
            return false;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int mx = 0;
        for (int i : nums)
            mx = Math.max(i, mx);
        int i = 1;
        int j = mx;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (isPossible(nums, mid, threshold))
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }

    public static int kokEatBanansOptimal(int[] nums, int h) {
        int mx = 0;
        for (int i : nums)
            mx = Math.max(i, mx);
        int i = 1;
        int j = mx;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int hrs = 0;
            for (int elem : nums)
                hrs += Math.ceilDiv(elem, mid);
            if (hrs <= h)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }

    public static int kokEatBanans(int[] nums, int h) {
        int mx = 0;
        for (int i : nums)
            mx = Math.max(i, mx);
        for (int k = 1; k <= mx; k++) {
            int hours = 0;
            for (int i = 0; i < nums.length; i++) {
                hours += Math.ceilMod(nums[i], k);
            }
            if (hours <= h)
                return k;
        }
        return -1;
    }
}
