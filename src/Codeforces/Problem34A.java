package Codeforces;

import java.util.Scanner;

public class Problem34A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int minIndex2 = -1;
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i]-arr[i-1])<min){
                min = Math.abs(arr[i]-arr[i-1]);
                minIndex = i-1;
                minIndex2 = i;
            }
        }
        if(Math.abs(arr[n-1]-arr[0])<min){
            minIndex = n-1;
            minIndex2 = 0;
        }
        System.out.println((minIndex+1)+" "+(minIndex2+1));
    }
}
