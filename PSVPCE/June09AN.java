
public class June09AN {
    public static void main(String[] args) {
        int[] arr = new int[] { 17, 15, 16, 1, 2, 5, 45, 1, 48, 89, 89, 89, 48 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }

    public static void isPrime(int num) {
        int factors = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors += 2;
            }
        }
        if (factors > 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }

    public static void printFactors(int num) {
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // System.out.println(i);
        // }
        // }
        // for (int i = 1; i <= num / 2; i++) {
        // if (num % i == 0) {
        // System.out.println(i);
        // }
        // }
        // System.out.println(num);
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                System.out.println(num / i);
            }
        }
    }

}
