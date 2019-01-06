/**
 * @author : codedsun
 * Created on 06/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/451/A"/>
 */
public class Problem451A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;
        while (n != 0 && m != 0) {
            n--;
            m--;
            if (c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
