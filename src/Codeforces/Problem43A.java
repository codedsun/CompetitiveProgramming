package Codeforces;

import java.util.Scanner;

public class Problem43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;
        String first = null, second = null, input;
        while (n-- >= 1) {
            input = sc.next();
            if (first == null) {
                first = input;
                a++;
            } else if (input.equals(first)) {
                a++;
            } else if (second == null) {
                second = input;
                b++;
            } else if (second.equals(input)) {
                b++;
            }
        }
        System.out.println((a > b) ? first : second);
    }
}
