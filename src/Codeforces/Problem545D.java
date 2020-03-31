package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/contest/545/problem/D"/>
 */
public class Problem545D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfGuys = sc.nextInt();
        long timeNeededToServe[] = new long[noOfGuys];
        for (int i = 0; i < noOfGuys; i++) {
            timeNeededToServe[i] = sc.nextLong();
        }

        Arrays.sort(timeNeededToServe);
        long countOfPeopleDisappointed = 0;
        long waitingTime = timeNeededToServe[0];
        for (int i = 1; i < noOfGuys; i++) {
            if (waitingTime > timeNeededToServe[i]) {
                countOfPeopleDisappointed++;
            } else {
                waitingTime = waitingTime + timeNeededToServe[i];
            }
        }

        System.out.println(noOfGuys-countOfPeopleDisappointed);

    }
}
