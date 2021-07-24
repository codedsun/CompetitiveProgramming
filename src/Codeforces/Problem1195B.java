package Codeforces;

import java.util.Scanner;

public class Problem1195B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n == 1 && k == 1) {
            System.out.println("0");
        } else {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum+i;
                if(sum-(n-i)==k){
                    System.out.println(n-i);
                    break;
                }
            }
        }
    }
}
