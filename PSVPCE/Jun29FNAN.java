import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Jun29FNAN {

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(
        // twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        // int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = new int[] { 2, 5, 6 };
        // mergeArraysOptimal(nums1, nums1.length - nums2.length, nums2, nums2.length);
        // System.out.println(Arrays.toString(nums1));
        // System.out.println(unionOfSortedArrays(
        // new int[] {
        // 1, 2, 3, 4, 5 },
        // new int[] {
        // 1, 2, 3, 6, 7
        // }
        // ));
        // System.out.println(unionOfSortedArraysOptimal(new int[] { 1, 2, 3, 4, 5 },
        // new int[] { 1, 2, 3, 6, 7 }));
        // ! Matrix Methods Calling from Here
        int[][] mat = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 6, 7, 8, },
                new int[] { 12, 13, 4, },
        };
        System.out.println(Arrays.toString(sumOfCols(mat)));
    }

    // ! Matrix Problems Start Here
    // ! Transpose Of matrix
    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] resMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resMatrix[j][i] = matrix[i][j];
            }
        }
        return resMatrix;
    }
    // ! 1 Sum of Rows

    public static int[] sumOfRows(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] resArr = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++)
                sum += mat[i][j];
            resArr[i] = sum;
        }
        return resArr;
    }

    public static int[] sumOfCols(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] resArr = new int[cols];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }
        return resArr;
    }

    // ! Matrix Problems End Here
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] resArr = new int[m + n];
        // ! For copying 1st array to Res =>[a1,a2,a3,_,_,_]
        for (int i = 0; i < m; i++) {
            resArr[i] = nums1[i];
        }
        // ! For copying 1st array to Res =>[a1,a2,a3,b1,b2,b3]
        for (int j = 0; j < n; j++) {
            resArr[m + j] = nums2[j];
        }
        // !Sorting Array
        Arrays.sort(resArr);
        return resArr;
    }

    public static void mergeArraysBetter(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
            System.out.println(Arrays.toString(nums1));
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeArraysOptimal(int[] nums1, int m, int[] nums2, int n) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        while (i >= 0) {
            if (j >= 0 && nums2[i] > nums1[j]) {
                nums1[k] = nums2[i];
                i--;
            } else {
                nums1[k] = nums1[j];
                j--;
            }
            k--;
        }
    }

    public static ArrayList<Integer> unionOfSortedArrays(int[] nums1, int[] nums2) {
        // ! TreeSet for storing unq Elements from Each Array
        TreeSet<Integer> unq = new TreeSet<>();
        // ! Adding nums1 to SET
        for (int i = 0; i < nums1.length; i++)
            unq.add(nums1[i]);
        // ! Adding nums2 to SET
        for (int j = 0; j < nums2.length; j++)
            unq.add(nums2[j]);
        // ! result ArrayList
        ArrayList<Integer> resArr = new ArrayList<>();
        // ! Copying ELements from Set to ArrayList for Result
        for (int val : unq) {
            resArr.add(val);
        }
        return resArr;
    }

    public static ArrayList<Integer> unionOfSortedArraysOptimal(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> resArr = new ArrayList<>();
        while (i <= nums1.length - 1 && j <= nums2.length - 1) {
            if (nums1[i] <= nums2[j]) {
                if (resArr.isEmpty() || resArr.get(resArr.size() - 1) != nums1[i]) {
                    resArr.add(nums1[i]);
                    i++;
                }
            } else {
                if (resArr.isEmpty() || resArr.get(resArr.size() - 1) != nums2[j]) {
                    resArr.add(nums2[j]);
                }
                j++;
            }
        }
        while (i <= nums1.length - 1) {
            if (resArr.isEmpty() || resArr.get(resArr.size() - 1) != nums1[i]) {
                resArr.add(nums1[i]);
                i++;
            }
        }
        while (j <= nums2.length - 1) {
            if (resArr.isEmpty() || resArr.get(resArr.size() - 1) != nums2[j]) {
                resArr.add(nums2[j]);
                j++;
            }
        }
        return resArr;
    }
}