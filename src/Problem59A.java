/**
 * @author : codedsun
 * Created on 04/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/59/A"/>
 */
public class Problem59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int smallCount = 0;
        int capitalCount = 0;
        int character;
        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            if (character >= 65 && character <= 90) {
                capitalCount++;
            } else {
                smallCount++;
            }
        }
        if (capitalCount > smallCount) {
            System.out.println(s.toUpperCase());
        } else if (capitalCount <= smallCount) {
            System.out.println(s.toLowerCase());
        }
    }
}
