package Codeforces;

import java.util.Scanner;

public class Problem242B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        long max = -1;
        int index = -1;
        long arr[][] = new long[n][2];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            arr[i][0] = a;
            arr[i][1] = b;
            if(a<min){
                min = a;
            }
            if(b>max){
                max = b;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i][0]==min && arr[i][1] == max){
                index = i+1;
                break;
            }
        }
        System.out.println(index);
    }
}
