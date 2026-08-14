public class July27FNAN {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(1));
    }

    public static boolean powerOfTwo(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        int res = 2;
        while (res <= n) {
            if (res == n)
                return true;
            res = res * 2;
        }
        return false;
    }

    public static int unsetIthBit(int n, int k) {
        return n & (~(1 << k));
    }

    public static int setIthBit(int n, int k) {
        return n | (1 << k);
    }

    public static boolean checkIthBit(int num, int pos) {
        return (num & (1 << pos)) != 0;
    }

    public static String decToBin(int num) {
        String bin = "";
        while (num > 0) {
            int rem = num % 2;
            bin = bin + Integer.toString(rem);
            num = num / 2;
        }
        return bin;
    }
}