package Codeforces;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long number[] = new long[t];
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            sum = sum + a;
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long sumEqual = sum;
            long coins = 0;
            if (x < max) {
            } else {
                coins = x - max;
                sum = sum+coins;
            }
            sum = sum-x;

            if (y < sum) {
            } else {
                long coins2 = y - sum;
                coins += coins2;
            }
            sum = sumEqual;
            System.out.println(coins);
        }
    }
}
