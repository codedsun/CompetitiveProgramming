package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1453A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            int c = 0;
            for (int j = 0; j < m; j++) {
                if (set.contains(sc.nextInt())) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
