package Codeforces;

import java.util.Scanner;

public class Problem149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        int sum = 0;
        int count =0 ;
        if(n == 0){
            System.out.println(sum);

        }else {
            for (int i = 0; i < 12; i++) {
                sum = sum+arr[i];
                count++;
                if(sum>=n){
                    break;
                }
            }
            if(sum < n){
                System.out.println("-1");
            }else {
                System.out.println(count);
            }
        }
    }

    //bubble sort
    private static void sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
