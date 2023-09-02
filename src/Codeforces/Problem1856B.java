package Codeforces;

import java.util.Scanner;

public class Problem1856B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long sum = 0;
            long count1 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum = sum+arr[i];
                if (arr[i] == 1) {
                    count1++;
                }
            }

            if (sum<count1+n || n == 1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
