package Codeforces; /**
 * @author : codedsun
 * Created on 17/12/18
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="http://codeforces.com/problemset/problem/236/A" />
 */
public class Problem236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //the name of the user
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i)); //this adds character of the string to the set @characterSet
        }
        if (characterSet.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
