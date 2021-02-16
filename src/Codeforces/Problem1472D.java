package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1472D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer [] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long sum = 0;
            Arrays.sort(a, Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    //alice turn
                    if (a[j] % 2 == 0) {
                        sum = sum + a[j];
                    }
                } else {
                    if (a[j] % 2 == 1) {
                        sum = sum - a[j];
                    }
                }
            }
            if (sum == 0) {
                System.out.println("Tie");
            } else if (sum > 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

    }
}
