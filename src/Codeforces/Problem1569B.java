package Codeforces;

import java.util.Scanner;

public class Problem1569B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            String s = sc.next();
            int ones = 0, twos = 0;
            for (int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i)-48;
                if (arr[i] == 1) {
                    ones++;
                } else {
                    twos++;
                }
            }
            if (twos ==  2 || twos == 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            // 1 = zero loses, 2 = one win
            char game[][] = new char[n][n];
            for (int i = 0; i < n; i++) {
                int x = 1;
                for (int j = i; j < n; j++) {
                    if (i == j) {
                        game[i][j] = 'X';
                        continue;
                    }
                    if (arr[i] == 1) {
                        game[i][j] = '=';
                        game[j][i] = '=';
                    } else {
                        if (x == 1 && arr[j] == 2) {
                            game[i][j] = '+';
                            game[j][i] = '-';
                            x = 2;
                        }else{
                            game[i][j] = '-';
                            game[j][i] = '+';
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(game[i][j]);
                }
                System.out.println();
            }
        }
    }
}
