/**
 * @author : codedsun
 * Created on 06/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/61/A"/>
 */
public class Problem61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no1 = sc.nextLine();
        String no2 = sc.next();
        String result = "";
        for (int i = 0; i < no1.length(); i++) {
            if ((Integer.parseInt(no1.charAt(i) + "") == Integer.parseInt(no2.charAt(i) + ""))) {
                result = result + "0";
            } else {
                result = result + "1";
            }
        }
        System.out.println(result);
    }
}
