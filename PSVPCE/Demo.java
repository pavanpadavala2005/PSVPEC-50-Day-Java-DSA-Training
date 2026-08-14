
public class Demo {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1000));
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        return rev;
    }

}
