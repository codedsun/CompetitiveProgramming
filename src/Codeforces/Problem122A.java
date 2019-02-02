package Codeforces; /**
 * @author : codedsun
 * Created on 16/12/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/122/A"/>
 */
public class Problem122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (checkDivisible(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkDivisible(String a) {
        int num = Integer.parseInt(a);
        if (num % 4 == 0 || num % 7 == 0 || num % 47 == 0) {
            return true;
        }
        a = a.replace("4", "");
        a = a.replace("7", "");
        if (a.length() == 0) {
            return true;
        }
        return false;
    }
}
