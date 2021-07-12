package Codeforces;

import java.util.Scanner;

public class Problem1139B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long sum = arr[n-1];
        long max = arr[n-1]-1;
        long s = 0;
        for (int i = n-2; i >=0 ; i--) {
            s = Math.min(arr[i],max);
            if ( s==0){
                break;
            }
            sum = sum+s;
            max = s-1;
        }
        System.out.println(sum);
    }
}
