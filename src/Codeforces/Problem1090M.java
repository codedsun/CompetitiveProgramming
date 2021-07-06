package Codeforces;

import java.util.Scanner;

public class Problem1090M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
           if(arr[i]!=arr[i-1]){
               count++;
           }else{
               max = Math.max(count, max);
               count = 1;
           }
            max = Math.max(count, max);
        }
        System.out.println(max);


    }
}
