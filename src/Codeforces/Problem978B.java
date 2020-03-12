package Codeforces;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/978/B"/>
 */
public class Problem978B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the length of the file name
        String s = sc.next();
        String xxx = "xxx";
        if(s.contains(xxx)){
            //s contains xxx as a substring
            while(true) {
                s = s.replaceAll(xxx,"xx");
                if(s.contains(xxx)){
                    continue;
                }else{
                    break;
                }
            }
            System.out.println(n-s.length());
        }else{
            System.out.println("0");
        }


    }
}
