package Codeforces;

import java.util.Scanner;

public class Problem34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
            if(arr[i]<0){
                sum = sum+Math.abs(arr[i]);
            }else{
                sum = sum-arr[i];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

    //selection sort
    private static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
