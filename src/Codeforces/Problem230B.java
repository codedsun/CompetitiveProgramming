package Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 18/02/19
 */
public class Problem230B {

    private static boolean[] generatePrime() {
        boolean a[] = new boolean[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }

        for (int p = 2; p * p < a.length; p++) {
            if (a[p]) {
                for (int i = p * p; i < a.length; i+=p) {
                    a[i] = false;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        boolean a[] = generatePrime();
        Scanner sc = new Scanner(System.in);
        long number;
        int sqt;
        int n = sc.nextInt();
        while (n-- >= 1) {
            number = sc.nextLong();
            sqt = (int) Math.sqrt(number);
            if (a[(sqt)] && number == (sqt * sqt)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

