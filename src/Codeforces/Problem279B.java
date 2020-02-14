package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/279/problem/B"/>
 */
public class Problem279B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of books
        int t = sc.nextInt(); // the maximum time

        int timeForBooks[] = new int[n];

        for(int i=0; i<n; i++) {
            timeForBooks[i] = sc.nextInt();
        }

        int countOfBooks = 0;
        int k = 0;
        int sum = 0;
        for(int j=0; j<n; j++) {
            sum = sum+timeForBooks[j];
            if(sum<=t){
                countOfBooks++;
            }else{
                sum = sum-timeForBooks[k];
                k++;
            }
        }
        System.out.println(countOfBooks);
    }
}
