package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem459B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[n-1];
        long count = 0;
        long countMax = 0;
        long countMin = 0;
        if(min  == max) {
            count = (long) n *(n-1);
            count = count/2;
        }else{
            for (int i = 0; i < n; i++) {
                if(arr[i]==max){
                    countMax++;
                }else if(arr[i] == min){
                    countMin++;
                }
            }
            count = countMax*countMin;
        }
        System.out.println(max-min+" "+count);
    }
}
