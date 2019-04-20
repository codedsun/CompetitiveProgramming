package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/499/B
 */
public class Problem499B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of words in professor lecture
        int m = sc.nextInt(); // the no of words in the language
        Map<String, String> languages = new HashMap<>(); //stores the language
        StringBuilder result = new StringBuilder();
        String s, s1;
        while (m-- >= 1) {
            s = sc.next();
            s1 = sc.next();
            languages.put(s, (s.length() <= s1.length()) ? s : s1);
        }
        while (n-- >= 1) {
            result.append(languages.get(sc.next()));
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
