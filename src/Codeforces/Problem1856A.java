package Codeforces;

import java.util.Scanner;

public class Problem1856A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for(int i=1; i<n; i++){
                if (arr[i-1]>arr[i]){
                    max = Math.max(arr[i-1], max);
                }
            }
            System.out.println(max);
         }
    }
}
