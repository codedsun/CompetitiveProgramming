package Codeforces; /**
 * @author : codedsun
 * Created on 06/01/19
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://codeforces.com/problemset/problem/469/A"/a>
 */
public class Problem469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> distinctElements = new LinkedHashSet<>();
        while (p-- >= 1) {
            distinctElements.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while (q-- >= 1) {
            distinctElements.add(sc.nextInt());
        }
        if (distinctElements.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}
