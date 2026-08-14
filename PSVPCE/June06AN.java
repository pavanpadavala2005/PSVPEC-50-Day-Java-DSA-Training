public class June06AN {
    public static void main(String[] args) {
        // int n = 2412;
        // System.out.println(isPalindrome(121));
        // System.out.println(fun());
        printDivisors(36);
    }

    public static int fun() {
        for (int i = 0; i < 0; i++) {
            return i;
        }
        return 0;
    }

    public static int countEvenDigits(int n) {
        int count = 0;
        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0)
                count++;
            n = n / 10;
        }
        return count;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        return temp == rev;
    }

    public static boolean allSame(int num) {
        int lastDigit = num % 10;
        while (num > 0) {
            int last = num % 10;
            if (lastDigit != last)
                return false;
            num = num / 10;
        }
        return true;

    }

    public static void printDivisors(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i + "*" + (num / i));
                // System.out.println(num / i);
            }
        }
    }

}
