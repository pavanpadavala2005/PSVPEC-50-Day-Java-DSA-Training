
public class June12FN {
    public static void main(String[] args) {
        // int n = 5;
        // System.out.println(power(2, 3));
        // System.out.println(reverse(12345, 0));
        // System.out.println(reverse(12345, 0));
        System.out.println(fib(7));
    }

    public static void printN(int n) {
        if (n <= 0)
            return;
        printN(n - 1);
        System.out.println(n);
    }

    public static void PrintN(int n) {
        if (n <= 0)
            return;
        PrintN(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static int sumOfN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static int countDigits(int n) {
        if (n <= 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    public static int sumOfDigits(int n) {
        if (n <= 0)
            return 0;
        return n % 10 + countDigits(n / 10);
    }

    public static int reverse(int num, int res) {
        if (num <= 0)
            return res;
        res = res * 10 + num % 10;
        return reverse(num / 10, res);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
