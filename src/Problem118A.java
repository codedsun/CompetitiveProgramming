/**
 * @author : codedsun
 * Created on 30/09/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/118/A"/>
 */

public class Problem118A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //string input
        s = s.toLowerCase();
        s = s.replaceAll("a", "");
        s = s.replaceAll("e", "");
        s = s.replaceAll("i", "");
        s = s.replaceAll("o", "");
        s = s.replaceAll("u", "");
        s = s.replaceAll("y", "");

        String result = "";
        char dot = '.';
        for (int i = 0; i < s.length(); i++) {
            result = result+dot+s.charAt(i);
        }

        System.out.println(result);
    }
}
