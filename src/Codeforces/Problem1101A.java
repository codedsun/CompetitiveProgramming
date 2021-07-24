package Codeforces;

import java.util.Scanner;

public class Problem1101A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- >= 1) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long d = sc.nextLong();
            long ans = 0;
            long b = (d);
            long e = ((r / d) + 1) * d;
            if(b<l){
                System.out.println(b);
            }else if(e>r){
                System.out.println(e);
            }
        }
    }
}
