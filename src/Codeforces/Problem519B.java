package Codeforces;

/**
 * @author : codedsun
 * Created on 12/03/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/519/B"/>
 */
public class Problem519B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int iteration = t - 2; //only 3 stages possible hence t,t-1,t-2
        long sum = 0; //the current stage sum
        long prevSum = 0; //the previous stage sum
        int c = 0;
        while (t-- >= iteration) {
            for (int i = 1; i <= (t + 1); i++) {
                sum = sum + sc.nextLong();
            }
            if (c == 0) {
                prevSum = sum;
            } else {
                System.out.println(prevSum - sum);
                prevSum = sum;
            }
            sum = 0;
            c++;
        }
    }
}
