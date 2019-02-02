package Codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : codedsun
 * Created on 22/01/19
 */

/**
 * <a href="https://codeforces.com/problemset/problem/520/A"/>
 */
public class Problem520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.trim();
        s = s.toLowerCase();
        Set<Character> alphabets = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            alphabets.add(s.charAt(i));
        }
        if (alphabets.size() == 26) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
