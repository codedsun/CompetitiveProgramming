package Codeforces;

import java.util.Scanner;

public class Problem1195B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n ==1 && k==1) {
            System.out.println("0");
        } else {
            long sum = 1;
            long eat = 0;
            long icecream = 2;
            for (int i = 2; i <= n; i++) {
                if (sum + icecream == k) {
                    sum = sum + icecream;
                    icecream++;
                } else if (sum - 1 == k) {
                    eat++;
                    sum--;
                } else if (i % 2 == 0) {
                    eat++;
                    sum--;
                } else {
                    sum = sum + icecream;
                    icecream++;
                }
            }
            System.out.println(eat);
        }
    }
}
