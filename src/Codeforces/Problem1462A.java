package Codeforces;

import java.util.Scanner;

public class Problem1462A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            String s = "";
            int start = 0;
            int end = n - 1;
            while (start < end) {
                s = s + a[start] + " " + a[end] + " ";
                start++;
                end--;
            }
            if (n % 2 != 0) {
                s = s + a[n / 2];
            }
            System.out.println(s.trim());
        }
    }
}
