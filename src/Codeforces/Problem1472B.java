package Codeforces;

import java.util.Scanner;

public class Problem1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count1 = 0, count2 = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    count1++;
                } else {
                    count2++;
                }
                sum = sum + arr[i];
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                sum = sum/2;
                if (sum % 2 == 0 || (sum % 2 == 1 && count1 != 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");

                }
            }
        }
    }
}
