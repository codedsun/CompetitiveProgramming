package Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 07/10/18
 */

/*
<a href ="http://codeforces.com/problemset/problem/339/A"/>
 */
public class Problem339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //the sum xenia needs to count
        int count1 = 0; // the count of 1
        int count2 = 0; // the count of 2
        int count3 = 0; //the count of 3
        String solution = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1++;
            } else if (s.charAt(i) == '2') {
                count2++;
            } else if (s.charAt(i) == '3') {
                count3++;
            }

        }

        for (int j = 0; j < count1; j++) {
            solution = solution + "1+";
        }
        for (int j = 0; j < count2; j++) {
            solution = solution + "2+";
        }
        for (int j = 0; j < count3; j++) {
            solution = solution + "3+";
        }

        solution = solution.substring(0, s.length());
        System.out.println(solution);
    }
}
