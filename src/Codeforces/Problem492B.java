package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        double mmaxDiff = 2*Math.max(arr[0],arr[n-1]-l);
        for (int i = 1; i < n; i++) {
            mmaxDiff = Math.max(mmaxDiff, arr[i]-arr[i-1]);
        }
        System.out.println(mmaxDiff/2);
    }

}
