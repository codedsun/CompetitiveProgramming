/**
 * @author : codedsun
 * Created on 01/02/19
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://codeforces.com/problemset/problem/228/A"/>
 */
public class Problem228A {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        Set<Integer> integers = new LinkedHashSet<>();
        for(int i = 1; i<=4 ; i++) {
            integers.add(sc.nextInt());
        }

        System.out.println(4-integers.size());
    }
}
