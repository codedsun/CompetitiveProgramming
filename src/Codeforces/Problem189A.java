package Codeforces;

import java.util.Scanner;

public class Problem189A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (n % a == 0) {
            max = Math.max(max, n / a);
        }
        if (n % b == 0) {
            max = Math.max(max, n / b);
        }
        if (n % c == 0) {
            max = Math.max(max, n / c);
        }
        if ((n/a) + (n/b) == n) {
            max = Math.max(max, 2);
        }
        if (a + c == n) {
            max = Math.max(max, 2);
        }
        if (a + b + c == n) {
            max = Math.max(max, 2);
        }
        if (b + c == n) {
            max = Math.max(max, 2);
        }
        System.out.println(max);
    }
}
