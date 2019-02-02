package Codeforces; /**
 * @author : codedsun
 * Created on 18/12/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/133/A"/>
 */
public class Problem133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //the input of the string
        if(input.contains("H") || input.contains("Q") || input.contains("9")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
