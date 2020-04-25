package Codeforces;

import java.util.Scanner;

public class Problem519C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>0 && m>0) {
            if(n>m) {
                System.out.println(Math.min(((n + m) / 3), m));
            }else{
                System.out.println(Math.min(((n + m) / 3), n));
            }
        }else {
            System.out.println("0");
        }
    }
}
