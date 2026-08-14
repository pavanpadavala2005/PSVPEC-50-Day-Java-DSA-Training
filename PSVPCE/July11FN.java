public class July11FN {
    public static void main(String[] args) {
        // System.out.println(kokoEatingBananas(
        // new int[] { 312884470 },
        // 968709470));

        System.out.println(smallestDivisor(new int[] { 1, 2, 5, 9 }, 6));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int mx = 0;
        for (int i : nums)
            mx = Math.max(i, mx);
        int i = 1;
        int j = mx;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (caluclateDivison(nums, mid) <= threshold)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }

    public static int caluclateDivison(int[] nums, int d) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += Math.ceilDiv(nums[i], d);
        return sum;
    }

    public static long kokoCalc(int[] nums, int k) {
        long hrs = 0;
        for (int i = 0; i < nums.length; i++) {
            hrs += (long) Math.ceilDiv(nums[i], k);
        }
        return hrs;
    }

    public static int kokoEatingBananas(int[] nums, int h) {
        int mx = Integer.MIN_VALUE;
        for (int i : nums)
            mx = Math.max(mx, i);
        long i = 1;
        long j = mx;
        while (i <= j) {
            long mid = i + (j - i) / 2;
            long hrs = 0;
            for (int idx = 0; idx < nums.length; idx++) {
                hrs += (long) Math.ceilDiv(nums[idx], mid);
            }
            if (hrs <= h)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return (int) i;
    }
}
