package Codeforces;

import java.util.Scanner;

public class Problem1559C {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- >= 1) {
            solve();
            System.out.println();
        }
    }

    private static void solve() {
        int n = sc.nextInt();
        int arr[] = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[1] == 1) {
            System.out.print(n + 1 + " ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            return;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0 && arr[i + 1] == 1) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.print(n + 1 + " ");
                for (int k = i + 1; k <= n; k++) {
                    System.out.print(k + " ");
                }
                return;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.print(n + 1);
    }
}
