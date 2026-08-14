
// ! as Functions Check it once     

public class June10 {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 30;
        // System.out.println(linearSeach(arr, target));
        // System.out.println(getValue());
        System.out.println(avg(arr));
    }

    public static int avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    // public static int getValue() {
    // for (int i = 0; i < 0; i++) {
    // if (i == 3) {
    // return i;
    // }
    // }
    // return 10;
    // }

    public static boolean linearSeach(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    //
    //
    // /
    //
    //
    //

    public static void gradeCaluclator1(int marks) {
        if (marks >= 90 && marks <= 100) {
            System.out.println("A Grade");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("B Grade");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("C Grade");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("D Grade");
        } else if (marks >= 40 && marks <= 49)
            System.out.println("E Grade");
        else {
            System.out.println("Fail");
        }
    }

    public static void gradeCaluclator2(int marks) {
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 50) {
            System.out.println("D Grade");
        } else if (marks >= 40)
            System.out.println("E Grade");
        else {
            System.out.println("Fail");
        }
    }

    public static void billCaluclator1(int units) {
        // This is Top Down Approach
        int bill = 0;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 6;
        } else if (units <= 300) {
            bill = (100 * 5) + (100 * 6) + (units - 200) * 7;
        } else {
            bill = (100 * 5) + (100 * 6) + (100 * 7) + (units - 300) * 8;
        }
        System.out.print("Total Bill=" + bill);
    }

    public static void billCaluclator2(int units) {
        // int units = 500;
        // This is My Logic Check Once
        int res = 0;
        if (units > 300) {
            int rem = units - 300;
            res += (8 * rem);
            units = 300;
        }
        if (units > 200) {
            int rem = units - 200;
            res += (7 * rem);
            units = 200;
        }
        if (units > 100) {
            int rem = units - 100;
            res += (6 * rem);
            units = 100;
        }
        if (units > 0) {
            int rem = units - 0;
            res += (5 * rem);
            units = 0;
        }
        System.out.println(res);

    }
}