package Codeforces;

import java.util.Scanner;

public class Problem1828B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int gcd = 0;
            int arr;
            for (int i = 1; i <= n; i++) {
                arr = sc.nextInt();
                gcd = gcd(gcd, Math.abs(arr-i));
            }
            System.out.println(gcd);
        }
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

}
