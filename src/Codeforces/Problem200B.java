package Codeforces; /**
 * @author : codedsun
 * Created on 02/02/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/200/B"/>
 */
public class Problem200B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of juices Vasya have
        double result = 0;
        for(int i = 1; i <=n; i++){
            result = result+sc.nextInt();
        }
        System.out.println((result/n));
    }
}
