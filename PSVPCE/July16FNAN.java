public class July16FNAN {
    public static void main(String[] args) {
        // System.out.println("Pages :" + findPages(new int[] {
        // // 25, 46, 28, 49, 24
        // 15, 17, 20
        // }, 5));

        // System.out.println(
        // findPages(
        // new int[] {
        // 25, 46, 28, 49, 24
        // }, 4));

    }

    public static int maxOnesInRow(int[][] mat) {
        int idx = -1;
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            int ctr = lowerBound(mat[i], 1);
            if (ctr > max) {
                max = ctr;
                idx = i;
            }
        }
        return idx;
    }

    public static int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] >= target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return n - i;
    }

    public static boolean searchInMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = (m * n) - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int row = mid / m;
            int col = mid % m;
            if (mat[row][col] == target)
                return true;
            else if (mat[row][col] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return false;
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;

        if (nums[0] > nums[1])
            return 0;

        if (nums[n - 1] > nums[n - 2])
            return n - 1;

        int i = 1;
        int j = n - 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid - 1] < nums[mid])
                i = mid + 1;
            else
                j = mid - 1;
        }
        return -1;
    }

    public static int findPages(int[] nums, int k) {
        int n = nums.length;
        if (k > n)
            return -1;
        int mx = Integer.MIN_VALUE;
        int sm = 0;
        for (int elem : nums) {
            mx = Math.max(mx, elem);
            sm += elem;
        }
        for (int i = mx; i <= sm; i++) {
            System.out.println("Limit : " + i + " Students : " + bookAllocationHelper(nums, i));
        }
        return -1;
    }

    public static int bookAllocationHelper(int[] nums, int pages) {
        int stu = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev + nums[i] <= pages)
                prev += nums[i];
            else {
                stu++;
                prev = nums[i];
            }
        }
        return stu;
    }
}