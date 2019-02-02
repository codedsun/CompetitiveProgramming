package Codeforces; /**
 * @author : codedsun
 * Created on 07/10/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/282/A"/>
 */
public class Problem282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the no of statements
        int x = 0; //
        while (n-- >= 1) {
            String operation = sc.next();
            if (operation.charAt(0) == 'X') {
                if (operation.charAt(1) == '+') {
                    x++;
                }
                if (operation.charAt(1) == '-') {
                    x--;
                }
            } else if (operation.charAt(0) == '+') {
                ++x;
            } else {
                --x;
            }
        }
        System.out.println(x);
    }
}
