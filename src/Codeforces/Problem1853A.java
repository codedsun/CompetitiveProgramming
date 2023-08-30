package Codeforces;

import java.util.Scanner;

public class Problem1853A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    min = Math.min(min, arr[i + 1] - arr[i]);
                } else {
                    min = -1;
                    break;
                }
            }
            if (min == Integer.MAX_VALUE || min == -1) {
                min = 0;
                System.out.println(min);
            } else {
                System.out.println((min / 2) + 1);
            }
        }
    }
}
