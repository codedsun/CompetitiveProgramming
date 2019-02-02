package Codeforces; /**
 * @author : codedsun
 * Created on 06/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/677/A"/>
 */
public class Problem677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of friends
        int h = sc.nextInt(); //the max height
        int count = 0;
        while (n-- >= 1) {
            if (sc.nextInt() <= h) {
                count++;
            } else {
                count = count + 2;
            }
        }
        System.out.println(count);
    }
}
