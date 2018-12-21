/**
 * @author : codedsun
 * Created on 18/12/18
 */

import java.util.Scanner;

/**
 * <a href ="http://codeforces.com/problemset/problem/467/A"/>
 */
public class Problem467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of rooms
        int p, q; //the people living in the room and the total capacity
        int counter = 0; //the rooms available for george and alex
        while (n-- >= 1) {
            p = sc.nextInt();
            q = sc.nextInt();
            if (q - p > 1) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
