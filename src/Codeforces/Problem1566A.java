package Codeforces;

import java.util.Scanner;

public class Problem1566A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long n = sc.nextLong();
            long s = sc.nextLong();
            double n1 = n;
            double medianIndex = Math.ceil(n1 / 2);
            if (n == 1) {
                System.out.println(s);
            } else {
                long index = (n - (medianIndex - 1)) > 0 ? (long) (n - (medianIndex - 1)) : n;
                long maxValue = (long) ((s) / (index));
                System.out.println( maxValue);
            }

        }
    }
}
