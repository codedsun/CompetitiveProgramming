package Codeforces;

import java.util.Scanner;

public class Problem1141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if(n == m){
            System.out.println("0");
        }else {
            System.out.println(count(n, m, 0));
        }

    }

    private static int count(long n, long m, int count) {
        if (n > m) {
            return -1;
        }
        if (n == m) {
            return count;
        }
        int c1 = count(n * 2, m, count + 1);
        int c2 = count(n * 3, m, count + 1);
        return Math.max(c1,c2);
    }
}
