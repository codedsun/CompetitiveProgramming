package Codeforces;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1855/A
 */

public class Problem1855A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1) {
            int n = sc.nextInt();
            int seats[] = new int[n+1];
            for (int i = 1; i <=n; i++) {
                seats[i] = sc.nextInt();
            }
            double count = 0;
            for (int i = 1; i <=n; i++) {
                if (i == seats[i]){
                    count++;
                }
            }
            System.out.println((int)Math.ceil(count/2));
        }
    }
}
