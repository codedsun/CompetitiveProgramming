package Codeforces;

import java.util.Scanner;

public class Problem1855B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long n = sc.nextLong();
            long j;
            for (j = 1; j <= n; j++) {
                if (n % j != 0) {
                    break;
                }
            }
            System.out.println(j - 1);

        }
    }
}
