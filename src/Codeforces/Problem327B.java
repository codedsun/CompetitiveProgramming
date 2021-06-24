package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem327B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean[] prime = new boolean[100001];
        findPrime(prime);
        for (int i = 2; i < prime.length; i++) {
            if (count >= n) {
                break;
            }
            if (prime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }

    }

    private static boolean[] findPrime(boolean[] prime) {
        Arrays.fill(prime, true);
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
