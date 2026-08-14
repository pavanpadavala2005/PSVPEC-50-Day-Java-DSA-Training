
public class June13FN {
    public static void main(String[] args) {
        // String a = "hello world";
        // check(a);
        // convertUpper("hello world");
        reverseString("Hello");
    }

    public static void check(String s) {
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                h++;
            }
        }
        System.out.println(h);
    }

    public static void countNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int asc = s.charAt(i);
            if (asc >= 48 && asc <= 57)
                count++;
        }
        System.out.println(count);
    }

    public static void convertUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int ascOfSmall = s.charAt(i);
            int ascOfUpper = ascOfSmall - 32;
            char upperChar = (char) ascOfUpper;
            res += upperChar;
        }
        System.out.println(res);
    }

    public static void reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        System.out.println(res);
    }

}