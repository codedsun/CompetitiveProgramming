package Codeforces;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            char result[][] = new char[n][n];
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                char choice = s.charAt(i);
                boolean win = false;
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        result[i][j] = 'X';
                    }
                    if (choice == '1' && s.charAt(j) == '1') {
                        result[i][j] = '=';
                    } else if (choice == '1' && s.charAt(j) == '2') {
                        result[i][j] = 'a';
                    } else if (choice == '2' && s.charAt(j) == '1') {
                        result[i][j] = '-';
                    } else if (choice == '2' && s.charAt(j) == '2') {
                        result[i][j] = '-';
                    }
                }
            }
        }
    }

}
