package Codeforces;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/363/B"/>
 */
public class Problem363B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the  no of planks
        int k = sc.nextInt(); //the no of planks to be taken out
        int h[]  = new int[n];

        for(int i =0 ;i<n ;i++) {
            h[i] = sc.nextInt();
        }
        int sum = 0; //to save the minium heights of planks
        int windowSum =0; //the save the sum of planks in a window
        int index = k-1;

        for(int i =0; i<k; i++){
            sum = h[i]+sum;
        }
        windowSum = sum;

        for(int j=k; j<n;j++){
            windowSum = windowSum+h[j]-h[j-k];
            if(windowSum < sum) {
                windowSum = sum;
                index = j;
            }
        }
        System.out.println(index-k+2);
    }
}
