package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1538C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long l = sc.nextLong();
            long r = sc.nextLong();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                arr[i] = a;
            }
            Arrays.sort(arr);
            long count = 0;
            int low = 0;
            int high = n - 1;
            long sum = 0;
            while (low < high) {
                sum = arr[low]+arr[high];
                if(sum>=l && sum<=r){
                    count++;
                }

                if(sum>r){
                    high--;
                }else{
                    low++;
                }

            }
            System.out.println(count);
        }
    }
}
