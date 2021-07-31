package Codeforces;

import java.util.Scanner;

public class Problem1468B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int ans = 0;
            int ans1 = Math.min(a,b)*Math.min(c,d);
            int ans2 = Math.min(a,c)*Math.min(b,d);
            int ans3 = Math.min(a,d)*Math.min(b,c);
            ans = Math.max(ans1, Math.max(ans2,ans3));
            System.out.println(ans);
        }
    }
}
