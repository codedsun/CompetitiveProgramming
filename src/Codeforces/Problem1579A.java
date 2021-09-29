package Codeforces;

import java.util.Scanner;

public class Problem1579A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String s = sc.next();
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                } else if (s.charAt(i) == 'B') {
                    b++;
                } else {
                    c++;
                }
            }
            if (a > b) {
                a = a - b;
                b = 0;
            } else {
                b = b - a;
                a = 0;
            }
            if (b > c) {
                b = b - c;
                c = c - c;
            } else {
                c = c - b;
                b = 0;
            }
            if(a == 0 && b== 0 && c == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
