package Codeforces;

import java.util.Scanner;

public class Problem1084A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long electricity = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 4;
        for (int i = 1; i < n; i++) {
            electricity += arr[i] * count;
            count+=4;
        }
        System.out.println(electricity);
    }
}
