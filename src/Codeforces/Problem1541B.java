package Codeforces;

import java.util.Scanner;

public class Problem1541B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long arr[] = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (long j = arr[i] - i; j <= n; j += arr[i]) {
                    if (j >= 0 && i<j) {
                        if (i + j == arr[i] * arr[(int) j]) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
