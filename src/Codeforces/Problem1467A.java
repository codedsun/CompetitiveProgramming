package Codeforces;

import java.util.Scanner;

public class Problem1467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int i = 1;
            int max = 9;
            boolean inc = false;
            while (i <= n) {
                System.out.print(max + "");
                if (i == 2) {
                    max = 8;
                    inc = true;
                } else if (i > 2 && max == 9) {
                    max = -1;
                }
                if (inc) {
                    max++;
                } else {
                    max--;
                }
                i++;
            }
            System.out.println();
        }
    }
}
