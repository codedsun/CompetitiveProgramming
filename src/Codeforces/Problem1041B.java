package Codeforces;

import java.util.Scanner;

public class Problem1041B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long gcd = gcd(x,y);
        x = x/gcd;
        y = y/gcd;
        System.out.println(Math.min(a/x, b/y));
    }

    static long gcd(long a, long b){

        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
