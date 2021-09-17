package Codeforces;

import java.util.Scanner;

public class Problem1567A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int l = sc.nextInt();
            String s = sc.next();
            String ns = "";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='D'){
                    ns = ns+'U';
                }else if(s.charAt(i) == 'U'){
                    ns = ns+'D';
                }else{
                    ns = ns+s.charAt(i);
                }
            }
            System.out.println(ns);
        }
    }
}
