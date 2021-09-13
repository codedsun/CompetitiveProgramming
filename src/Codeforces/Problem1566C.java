package Codeforces;

import java.util.Scanner;

public class Problem1566C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            String s1 = sc.next();
            int arr[][] = new int[2][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 1) {
                        arr[i][j] = s1.charAt(j) - 48;
                    } else {
                        arr[i][j] = s.charAt(j) - 48;
                    }
                }
            }
            long max = 0;
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < n; ) {
                    if ((arr[0][j] == 1 && arr[1][j] == 0)|| (arr[0][j] == 0 && arr[1][j] == 1)) {
                        max = max + 2;
                        j++;
                    } else if (j + 1 < n && arr[0][j] == 1 && arr[0][j + 1] == 0) {
                        max = max + 2;
                        j = j + 2;
                    }
                    else if (j + 1 < n && arr[0][j] == 0 && arr[0][j + 1] == 1) {
                        if(arr[1][j+1] == 1) {
                            max = max + 2;
                            j = j + 2;
                        }else{
                            max = max+1;
                            j++;
                        }
                    }
                    else if (arr[0][j] == 0 && arr[1][j] == 0) {
                        max = max + 1;
                        j++;
                    } else {
                        j++;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
