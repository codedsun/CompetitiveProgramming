package Codeforces;

import java.util.Scanner;

public class Problem1036A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println((n+k-1)/n);
    }
}
