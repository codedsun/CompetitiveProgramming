//package Codeforces;

import java.util.Scanner;

public class Problem1472C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int dp[] = new int[n];
            int a;
            int max = 0;
            for (int j = n - 1; j >= 0; j--) {
                dp[j] = arr[j];
                a = arr[j] + j;
                if (a < n) {
                    dp[j] = dp[a] + dp[j];
                }
                max = Math.max(dp[j], max);
            }
            System.out.println(max);
        }
    }
}
