package Codeforces;

import java.util.Scanner;

public class Problem1554B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextLong();
            }
            long min = Long.MIN_VALUE, ans;
            int minI = Math.max(1, n - 500);
            for (int i = minI; i <= n; i++) {
                for (int j = i+1; j <=n ; j++) {
                    ans = (((long) i * j) - (k * (arr[i] | arr[j])));
                    min = Math.max(min, ans);
                }
            }
            System.out.println(min);
        }
    }
}
