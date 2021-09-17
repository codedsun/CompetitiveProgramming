package Codeforces;

import java.util.Scanner;

public class Problem1567C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1) {
            int n = sc.nextInt();
            int i = 1;
            int a = 0, b = 0;
            int c1 = 1, c2 = 1;
            while (n > 0) {
                int r = n % 10;
                if (i % 2 == 0) {
                    a = c1 * r + a;
                    c1 = c1 * 10;
                } else {
                    b = c2 * r + b;
                    c2 = c2 * 10;
                }
                i++;
                n = n / 10;
            }
            System.out.println(((a+1)*(b+1))-2);
        }
    }
}
