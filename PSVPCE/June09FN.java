
public class June09FN {
    // public static void main(String[] args) {
        // int[] arr; // ! Declare now
        // arr = new int[5]; // ! Initialize later

        // int[] arr1 = new int[5];

        // int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
        // int arr[] = new int[5];

        // int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println(arr[0]);
        // arr[1] = 200;
        // arr[2]++;
        // System.out.println(Arrays.toString(arr));
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Size : ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.printf("Element At idx - %d : ", i);
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // System.out.println(sumOfArrayElements(new int[] { 1, 2, 4, 8, 7, 9 }));

        // System.out.println();
        // int res = getValue();
        // System.out.println(res);

        // int[] res = sumOfEvenAndOdd(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        // System.out.println(Arrays.toString(
        // res));

        // sumOfEvenAndOdd(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 })
        //
        // ;
    // }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2, 5, 0, -1, 2, 7, 14, 7, 11, 3 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void sumOfEvenAndOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        System.out.println("Sum of Evens : " + even);
        System.out.println("Sum of Odds : " + odd);
    }

    public static int getValue() {
        return 10;
    }
}
