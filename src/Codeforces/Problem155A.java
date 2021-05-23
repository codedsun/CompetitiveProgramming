package Codeforces;

import java.util.Scanner;

public class Problem155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int amazing = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i]>max){
                amazing++;
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
                amazing++;
            }
        }
        System.out.println(amazing);
    }
}
