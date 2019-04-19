package Codeforces;

import java.util.Scanner;


/**
 * <a href="https://codeforces.com/problemset/problem/313/B"/>
 */
public class Problem313B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int t = sc.nextInt();
        int x, y;
        int[] eq = new int[str.length()];
        for (int j = 1; j <eq.length; j++) {
            if (str.charAt(j) == str.charAt(j - 1)) {
                eq[j] += eq[j - 1]+1;
            } else {
                eq[j] = eq[j - 1];
            }
        }
        while (t-- >= 1) {
            x = sc.nextInt();
            y = sc.nextInt();

            System.out.println(eq[y-1] - eq[x-1]);
        }
    }
}
