package Codeforces; /**
 * @author : codedsun
 * Created on 07/10/18
 */

import java.util.Scanner;

/**
 * <a href = "http://codeforces.com/problemset/problem/266/A"/>
 */
public class Problem266A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of stone on the table
        String s = sc.next();
        int count = 0;//the no of stones that have to be taken out
        char z = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (z == s.charAt(i)) {
                count++;
            }
            z = s.charAt(i);
        }

        System.out.println(count);

    }
}

