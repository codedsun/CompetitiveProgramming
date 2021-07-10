package Codeforces;

import java.util.Scanner;

public class Problem1133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int h1 = Integer.parseInt(s1.substring(0,2));
        int m1 = Integer.parseInt(s1.substring(3));
        int h2 = Integer.parseInt(s2.substring(0,2));
        int m2 = Integer.parseInt(s2.substring(3));
        int t1 = (h1*60)+m1;
        int t2 = (h2*60)+m2;
        int t3 = (t1+t2)/2;
        System.out.printf("%02d:%02d",(t3/60),(t3%60));
    }
}
