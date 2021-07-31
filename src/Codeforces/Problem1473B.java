package Codeforces;

import java.util.Scanner;

public class Problem1473B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String first = sc.next();
            String second = sc.next();
            if (first.length() < second.length()) {
                String temp = first;
                first = second;
                second = temp;
            }
            int lcm = lcm(first.length(), second.length());
            int firstLcm = lcm/first.length();
            int secondLcm = lcm/second.length();
            String firstWith = "", secondWith = "";
            for (int i = 1; i <= firstLcm; i++) {
                firstWith+= first;
            }
            for (int i = 1; i <= secondLcm; i++) {
                secondWith+=second;
            }
            if(firstWith.equalsIgnoreCase(secondWith)){
                System.out.println(firstWith);
            }else{
                System.out.println("-1");
            }
        }
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return gcd(b % a, a);
        }
    }
}
