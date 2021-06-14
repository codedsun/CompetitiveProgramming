package Codeforces;

import java.util.Scanner;

public class Problem124A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(n-a, b+1));
    }
}
