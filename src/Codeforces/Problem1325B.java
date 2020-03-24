package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://codeforces.com/problemset/problem/1325/B"/>
 */
public class Problem1325B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long a[] = new  long[n];
            Set<Long> distinctElements = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                distinctElements.add(a[i]);
            }
            System.out.println(distinctElements.size());
        }

    }
}
