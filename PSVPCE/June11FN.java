
import java.util.Scanner;

public class June11FN {

    public static void main(String[] args) {
        /*
         * double a = 100.0;
         * int y = 5;
         * for (int i = 0; i < y; i++) {
         * if (y >= 5) {
         * a = a + a * 0.1;
         * } else if (y <= 3) {
         * a = a + a * 0.05;
         * } else if (y >= 1) {
         * a = a + a * 0.03;
         * } else {
         * break;
         * }
         * 
         * }
         * System.out.println(a);
         */
        // int balls = 50;
        // int runs = 75;
        // int strikes;
        // strikes = runs / balls * 100;
        // if (strikes >= 150) {
        // System.out.println("Explosive");
        // } else if (strikes >= 100 && strikes < 150) {
        // System.err.println("Good strikes");
        // } else {
        // System.err.println("Poor strikes");
        // // }
        // int d = 380;
        // int l = 20;
        // int result = d / l;
        // if (result >= 20) {
        // System.out.println("excellent");
        // } else if (result >= 15 && result <= 20) {
        // System.out.println("good");
        // } else if (result < 15) {
        // System.out.println("poor");
        // }
        // System.out.println((int) 3800 / 500);
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if (amt % 100 != 0) {
            System.out.println("cannot dispense");
            return;
        }
        int fiveCount = amt / 500;
        amt = amt - fiveCount * 500;
        System.out.println("500x" + fiveCount);
        int towCount = amt / 200;
        amt = amt - towCount * 200;
        System.out.println("200x" + towCount);
        int oneCount = amt / 100;
        amt = amt - oneCount * 100;
        System.out.println("100x" + oneCount);
    }
}