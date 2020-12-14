package Codeforces;

import java.util.Scanner;

public class Problem298C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int countA = 0;
        int countB = 0;
        for (int i = 0, j = 0; i < a.length() || j < b.length(); i++, j++) {
            if (j < b.length() && b.charAt(j) == '1') {
                countB++;
            }
            if (i < a.length() && a.charAt(i) == '1') {
                countA++;
            }
        }
        if (countA % 2 == 1) {
            countA++;
        }
        if (countA >= countB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
