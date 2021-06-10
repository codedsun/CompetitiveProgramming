package Codeforces;

import java.util.Scanner;

public class Problem1538A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1) {
            int n = sc.nextInt();
            int max  = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxindex = -1;int minIndex = -1;
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                arr[i] = a;
                if(a>max){
                    max = a;
                    maxindex = i;
                }
                if(a<min){
                    min = a;
                    minIndex = i;
                }
            }
            maxindex++;
            minIndex++;
            if(maxindex - minIndex == 1){
                int resultFromStart = Math.max(maxindex, minIndex);
                int resultFromEnd = Math.max(n-maxindex, n-minIndex)+1;
                System.out.println(Math.min(resultFromEnd, resultFromStart));
            }else{
                int resultFromStart = maxindex+(n-minIndex)+1;
                int resultFromEnd = (n-maxindex)+1+minIndex;
                int result1 = Math.max(maxindex, minIndex);
                int result2 = Math.max(n-maxindex, n-minIndex)+1;
                int result = Math.min(result1, result2);
                System.out.println(Math.min(Math.min(resultFromEnd, resultFromStart), result));
            }
        }
    }
}
