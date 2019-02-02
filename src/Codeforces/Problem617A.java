package Codeforces; /**
 * @author : codedsun
 * Created on 22/12/18
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/617/A"/>
 */
public class Problem617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the coordinate of the friends' house
        int steps[] = new int[]{5, 4, 3, 2, 1}; //the steps of elephant
        int count = 0; //the no of steps taken by elephant
        for (int i = 0; i < steps.length; i++) {
            if (n >= steps[i]) {
                count = count + (n / steps[i]);
                n = n % steps[i];
            }
        }
        System.out.println(count);
    }
}
