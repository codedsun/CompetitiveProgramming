package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1037B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long count = Math.abs(s-a[n/2]);
        for(int i =0; i<n/2; i++){
            if(a[i]>s) {
                count += a[i]-s;
            }else if(a[n-1-i]<s){
                count += s-a[n-1-i];
            }
        }
        System.out.println(count);
    }
}
