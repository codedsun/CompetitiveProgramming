package Codeforces;

import java.util.Scanner;

public class Problem1539B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        while (q-- >= 1) {
            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();
            String substring = s.substring(startIndex-1, endIndex);
            int length = 0;
            for (int i = 0; i < substring.length(); i++) {
                char ch = substring.charAt(i);
                length += ch-96;
            }
            System.out.println(length);
        }
    }
}
