//package Codeforces;

import java.util.Scanner;

public class Problem1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int el = -1;
            boolean same = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (el == -1) {
                    el = arr[i];
                    continue;
                }
            }
            long sum = 0;
            long max = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                sum = 0;
                sum = sum + arr[i];
                j = (int) (i + arr[i]);
                while (j < n) {
                    sum = sum + arr[j];
                    j = (int) (j + arr[j]);
                }
                max = Math.max(sum, max);
                if(same){
                   break;
                }
            }
            System.out.println(max);

        }
    }
}


