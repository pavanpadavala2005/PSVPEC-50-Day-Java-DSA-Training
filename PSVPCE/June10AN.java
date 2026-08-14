public class June10AN {
    public static void main(String[] args) {
        // int[] arr = new int[] { 10, 20, 30, 30, 30, 40, 50, 80 };
        // int target = 30;
        // System.out.println(linearSearch(arr, target));
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(issortedArray(arr));
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int sumOfDigit(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (i % 2 == 0) {
                sum += arr[i];
            }
        return sum;
    }

    public static boolean issortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static double AverageOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
}
