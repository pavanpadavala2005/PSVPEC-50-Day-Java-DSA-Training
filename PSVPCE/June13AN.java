public class June13AN {
    public static void main(String[] args) {
        printNums(10);
    }

    public static void printNums(int n) {
        if (n <= 0)
            return;
        printNums(n - 1);
        System.out.println(n);
    }

    public static int factf(int n) {
        if (n <= 0)
            return 1;
        return n * factf(n - 1);
    }

    public static int countDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static int fib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}