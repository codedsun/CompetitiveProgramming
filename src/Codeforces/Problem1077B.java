package Codeforces;

import java.util.Scanner;

public class Problem1077B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            a[i] = arr[i];
        }
        int c= 0;
        int c1= 0;
        for (int i = 2; i < n; i++) {
            if(arr[i]==1 && arr[i-1]==0 && arr[i-2]==1){
                arr[i-2]=0;
                c++;
            }
            if(a[i]==1 && a[i-1]==0 && a[i-2]==1){
                a[i]=0;
                c1++;
            }
        }
        System.out.println(Math.min(c,c1));
    }
}
