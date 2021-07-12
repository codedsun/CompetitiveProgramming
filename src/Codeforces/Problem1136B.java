package Codeforces;

import java.util.Scanner;

public class Problem1136B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = 3*n+Math.min(n-k,k-1);
        System.out.println(total);
    }
}
