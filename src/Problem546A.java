/**
 * @author : codedsun
 * Created on 17/12/18
 */

import java.util.Scanner;

/**
 * <a href= "http://codeforces.com/problemset/problem/546/A"/>
 */
public class Problem546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //the initital value of the banana
        int n = sc.nextInt(); //the initial no of dollars
        int w = sc.nextInt(); //the no of bananas he has to buy
        int sum = (((w * (w + 1)) * k) / 2);
        if (sum - n < 0) {
            System.out.println("0");
        } else {
            System.out.println(sum - n);
        }
    }
}
