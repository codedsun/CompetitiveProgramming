package Codeforces;

import java.util.Scanner;

public class Problem1453B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long a[] = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long total = 0;
            for (int i = 1; i < n; i++) {
                total = total + Math.abs(a[i] - a[i - 1]);
            }
            long max = Math.max(a[1]-a[0],a[n-1]-a[n-2]);
            for (int i = 1; i < n-1; i++) {
                max = Math.max(max, Math.abs(a[i]-a[i-1])+Math.abs(a[i+1]-a[i])-Math.abs(a[i+1]-a[i-1]));
            }
            System.out.println(total-max);

        }
    }
}
