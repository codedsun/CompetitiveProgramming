package Codeforces;

import java.util.Scanner;

public class Problem1837B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int l = sc.nextInt();
            String s = sc.next();
            int sMax = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    count++;
                    sMax = Math.max(count, sMax);
                } else {
                    sMax = Math.max(count, sMax);
                    count = 0;
                }
            }
            count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '>') {
                    count++;
                    sMax = Math.max(count, sMax);
                } else {
                    sMax = Math.max(count, sMax);
                    count = 0;
                }
            }

            System.out.println(sMax+1);
        }
    }
}
