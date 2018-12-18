/**
 * @author : codedsun
 * Created on 18/12/18
 */

import java.util.Scanner;

/**
 * <a href ="http://codeforces.com/problemset/problem/69/A"/>
 */
public class Problem69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of the set of forces acting on the body
        int x = 0, y = 0, z = 0;
        while (n-- >= 1) {
            x = x + sc.nextInt();
            y = y + sc.nextInt();
            z = z + sc.nextInt();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
