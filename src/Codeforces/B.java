package Codeforces;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();
            if (m == 0) {
                if (b >=a && b >=c) {
                    long temp = a;
                    a = b;
                    b = temp;
                }else if(c>=a && c>=b){
                    long temp = a;
                    a = c;
                    c = temp;
                }
                long sum = a - b - c;
                if ((Math.abs(sum)) > 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                if (((a / 2) + (b / 2) + (c / 2)) == m) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
