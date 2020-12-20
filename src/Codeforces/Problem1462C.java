package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1462C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        while (t-- >= 1) {
            String number = "";
            long sum = 0;
            int i = 0;
            int x = sc.nextInt();

            while (sum < x && i < digits.length) {
                number = number + Math.min(x - sum, digits[i]);
                sum = sum + digits[i];
                i++;
            }

            if (sum < x) {
                System.out.println("-1");
            } else {
                System.out.println(new StringBuilder(number).reverse().toString());
            }


        }
    }
}
