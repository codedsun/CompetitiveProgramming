package Codeforces;

import java.util.Scanner;

public class Problem349A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count25 = 0;
        int count50 = 0;
        boolean pass = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 25) {
                count25++;
            } else if (arr[i] == 50) {
                if (count25 >= 1) {
                    count25--;
                    count50++;
                } else {
                    pass = false;
                    break;
                }
            } else {
                //if arrr[i] = 100
                //give 25 50
                if (count25 >= 1 && count50 >= 1) {
                    count25--;
                    count50--;
                } else if (count25 >= 3) {
                    count25 = count25 - 3;
                } else {
                    pass = false;
                    break;
                }
            }
        }
        if (pass) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
