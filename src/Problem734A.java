/**
 * @author : codedsun
 * Created on 06/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/734/A"/>
 */
public class Problem734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.replaceAll("A", ""); //the no of D present in the string
        int noofA = n - s.length();
        if (noofA > s.length()) {
            System.out.println("Anton");
        } else if (noofA < s.length()) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
