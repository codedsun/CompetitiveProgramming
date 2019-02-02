package Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 07/10/18
 */
public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (Character.isLowerCase(s.charAt(0))) {
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length());
        }
        System.out.println(s);
    }
}
