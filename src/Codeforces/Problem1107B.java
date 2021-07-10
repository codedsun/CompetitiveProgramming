package Codeforces;

import java.util.Scanner;

public class Problem1107B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            long k = sc.nextLong();
            long x = sc.nextLong();
            System.out.println(((9*(k-1))+x));
        }
    }
}
