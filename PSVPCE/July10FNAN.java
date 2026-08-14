class July10FNAN {
    public static void main(String[] args) {
        // System.out.println(findMinV2(new int[] {
        // 7, 8, 9, 1, 2, 3, 4, 5, 6
        // 6, 7, 8, 9, 1, 2, 3, 4, 5
        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 16, 18, 22, 23, 24, 36, 43, 1, 2
        // }));
        // System.out.println(singleElement(
        // new int[] {
        // 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9
        // }));

        // System.out.println(Math.(Integer.MAX_VALUE));
        // System.out.println((long) 2147483647 * 2147483647);
        System.out.println(nRootM(7, 2));
    }


    public static int nRootMOptimal(int n, int m) {
        int i = 1;
        int j = m;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int res = 1;
            for (int k = 0; k < n; k++)
                res *= mid;
            if (res < m)
                i = mid + 1;
            else if (res > m)
                j = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int nRootM(int n, int m) {
        if (n == 1)
            return m;
        if (n > m)
            return -1;
        for (int x = 1; x < m; x++) {
            int res = 1;
            for (int i = 0; i < n; i++)
                res *= x;
            if (res == m)
                return x;
            if (res > m)
                return -1;
        }
        return -1;
    }

    public static boolean perfectSquare(int num) {
        int i = 1;
        int j = num;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            long sqr = (long) mid * mid;
            if (sqr < num)
                i = mid + 1;
            else if (sqr > num)
                j = mid - 1;
            else
                return true;
        }
        return false;
    }

    public static int singleElement(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];
        int i = 1;
        int j = n - 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if (mid % 2 == 0) // if Even
            {
                if (nums[mid] == nums[mid + 1]) // if we get even in Left Half
                    i = mid + 1;
                else // if we get even in Right Half
                    j = mid - 1;
            } else {
                if (nums[mid] == nums[mid + 1])
                    j = mid - 1;
                else
                    i = mid + 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int minVal = Integer.MAX_VALUE;
        int idx = 0;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            // When Left Part is Sorted Assume the left is Possible Minimum update
            if (nums[i] < nums[mid]) {
                minVal = Math.min(minVal, nums[i]);
                idx = i;
                i = mid + 1;
            }
            // When Right Part is Sorted Assume the Mid is Possible Minimum update
            else {
                minVal = Math.min(minVal, nums[mid]);
                idx = mid;
                j = mid;
            }
        }
        return idx;
    }

    public static int countRotations(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        int ctr = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                return ctr;
            } else {
                ctr++;
            }
        }
        if (ctr == n)
            return 0;
        else
            return ctr;
    }

    public static int findMax(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int maxVal = Integer.MIN_VALUE;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[i] <= nums[mid]) {
                maxVal = Math.max(maxVal, nums[mid]);
                i = mid + 1;
            } else {
                maxVal = Math.max(maxVal, nums[j]);
                j = mid - 1;
            }
        }
        return maxVal;
    }

    public static int findMinV2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] < nums[j])
                j = mid;
            else
                i = mid + 1;
        }
        return j;
    }

    public static boolean search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[i] == nums[mid] && nums[mid] == nums[j]) {
                i++;
                j--;
                continue;
            }
            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target <= nums[mid])
                    j = mid - 1;
                else
                    i = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[j])
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }
        return false;
    }
}