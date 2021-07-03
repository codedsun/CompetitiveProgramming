package Codeforces;

import java.util.Scanner;

public class Problem1033A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q1 = sc.nextInt();
        int q2 = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        if ((c1 > q1 && k1 > q1 && c2 > q2 && k2 > q2) || (k1 < q1 && k2 > q2 && c1 < q1 && c2 > q2) ||
                (c1 < q1 && k1 < q1 && c2 < q2 && k2 < q2) ||
                (k1>q1 && c1>q1 && k2<q2 && c2<q2)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
