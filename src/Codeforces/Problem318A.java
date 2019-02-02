package Codeforces; /**
 * @author : codedsun
 * Created on 04/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/318/A"/>
 */
public class Problem318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        //Calculate total Odd terms in the series
        long oddTerms = 0;
        if (n % 2 == 0) {
            //n = even
            oddTerms = (((n - 1 - 1) / 2) + 1);
        } else {
            // n = odd
            oddTerms = (((n - 1) / 2) + 1);
        }

        if (k > oddTerms) {
            k = k - oddTerms;
            System.out.println(k * 2);
            return;
        }
        System.out.println((k * 2) - 1);
    }
}
