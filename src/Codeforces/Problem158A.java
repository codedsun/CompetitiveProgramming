package Codeforces; /**
 * @author : codedsun
 * Created on 30/09/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/158/A"/>
 */
public class Problem158A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of participants
        int k = sc.nextInt(); //the finisher's player position
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); //the scores' of ith participant
        }

        int score = a[k - 1];
        int countOfPlayers = 0;

        for (int j = 0; j < n; j++) {
            if (a[j] >= score && (score != 0 || a[j] != 0)) {
                countOfPlayers++;
            } else if (a[j] < score) {
                break;
            }
        }

        System.out.println(countOfPlayers);

    }
}
