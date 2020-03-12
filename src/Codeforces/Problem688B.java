package Codeforces;

import java.util.Scanner;

public class Problem688B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  n = sc.next();
        System.out.println(n + "" + new StringBuilder(n).reverse().toString());
    }
}
