package Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 07/10/18
 */

/*
    <a href="http://codeforces.com/problemset/problem/96/A" />
 */
public class Problem96A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // the players position
        if (s.contains("1111111") || s.contains("0000000")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

}
