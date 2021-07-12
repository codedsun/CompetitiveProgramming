package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1547C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] mono = new int[n];
            int[] poly = new int[m];
            for (int i = 0; i < n; i++) {
                mono[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                poly[i] = sc.nextInt();
            }
            int[] arr = new int[n + m];
            boolean loop = true;
            int i = 0;
            int j = 0;
            int index =0;
            while (i < n || j < m) {
                if (i < n && mono[i] == 0) {
                    k++;
                    arr[index] = mono[i];
                    i++;index++;
                } else if (i < n && k >= mono[i]) {
                    arr[index] = mono[i];
                    i++;index++;
                } else if (j < m && poly[j] == 0) {
                    k++;
                    arr[index] = poly[j];
                    j++;index++;
                } else if (j < m && k >= poly[j]) {
                    arr[index] = poly[j];
                    j++;index++;
                } else {
                    loop = false;
                    break;
                }

            }
            if (!loop) {
                System.out.println("-1");
            } else {
                for (int l = 0; l < arr.length; l++) {
                    System.out.print(arr[l]+" ");
                }
                System.out.println();
            }
        }
    }
}
