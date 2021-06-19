package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1537C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            if(n==2){
                System.out.println(arr[0]+" "
                +arr[1]);
                continue;
            }
            long min = Long.MAX_VALUE;
            int pos = -1;
            for (int i = 1; i < n; i++) {
                if(arr[i]-arr[i-1]<min)
                {
                    min = arr[i]-arr[i-1];
                    pos = i;
                }
            }
            for (int i = pos; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            for (int i = 0; i < pos; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
