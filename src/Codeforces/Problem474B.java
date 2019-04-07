package Codeforces;

import java.util.Scanner;

/**
 * https://codeforces.com/contest/474/problem/B
 */
public class Problem474B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] range = new long[1000001];
        int pile = 1;
        int index = 1;
        long worms;
        int p = sc.nextInt(); //the no of piles
        while (p-- >= 1) {
            worms = sc.nextLong();
            for (int i = 0; i < worms; i++) {
                range[index] = pile;
                index++;
            }
            pile++;
        }

        int x = sc.nextInt(); //the no of juicy piles
        while (x-- >= 1) {
            System.out.println(range[sc.nextInt()]);
        }
    }
}
