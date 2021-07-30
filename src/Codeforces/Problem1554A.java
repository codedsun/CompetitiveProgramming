package Codeforces;

import java.util.Scanner;

public class Problem1554A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long max = 0;
            for (int i = 1; i < n; i++) {
                max = Math.max(max, arr[i]*arr[i-1]);
            }
            System.out.println(max);
        }
    }
}
