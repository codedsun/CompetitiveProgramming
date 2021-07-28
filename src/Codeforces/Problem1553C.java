package Codeforces;

import java.util.Scanner;

public class Problem1553C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String s = sc.next();
            int a = 0;
            int b = 0;
            int ans = 9;
            int remA = 0;
            int remB = 0;

            //match for a
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    remB++;
                    //odd places
                    if (s.charAt(i) == '1') {
                        b++;
                    }
                } else {
                    remA++;
                    if (s.charAt(i) == '1' || s.charAt(i) == '?') {
                        a++;
                    }
                }
                if (a > (b + (5 - remB))) {
                    ans = Math.min(ans, i);
                }
                if (b > (a + (5 - remA))) {
                    ans = Math.min(ans, i);
                }
            }

            a = 0;
            b= 0;
            remA = 0;
            remB = 0;
            //match for b
            //match for a
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    remB++;
                    //odd places
                    if (s.charAt(i) == '1' || s.charAt(i) == '?') {
                        b++;
                    }
                } else {
                    remA++;
                    if (s.charAt(i) == '1') {
                        a++;
                    }
                }
                if (a > (b + (5 - remB))) {
                    ans = Math.min(ans, i);
                }
                if (b > (a + (5 - remA))) {
                    ans = Math.min(ans, i);
                }
            }
            System.out.println(ans + 1);

        }
    }
}
