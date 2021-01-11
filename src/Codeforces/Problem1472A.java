package Codeforces;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/1472/problem/A"></a>
 */

public class Problem1472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            long n = sc.nextLong();
            long sheets = 1;
            while (w % 2 == 0) {
                w = w / 2;
                sheets = sheets * 2;
            }
            while (h % 2 == 0) {
                h = h/2;
                sheets = sheets*2;
            }
            if(sheets>=n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
