package Codeforces;


import java.util.Scanner;

/*
    <a href="https://codeforces.com/problemset/problem/688/B"/>
 */
public class Problem688B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder number = new StringBuilder(sc.next()); //because it's mutable and strings are immutable
        System.out.println(number.toString()+""+number.reverse());
    }
}
