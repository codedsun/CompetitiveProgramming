package Codeforces;

import java.util.Scanner;

public class Problem227B {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int pos[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            pos[a] = i + 1;
        }
        int m = sc.nextInt();
        long vasya = 0, petya = 0;
        while (m-- >= 1) {
            int query = sc.nextInt();
            vasya += pos[query];
            petya += n - pos[query] + 1;
        }
        System.out.println(vasya+" "+petya);
    }

    private static int search(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return 0;
    }

}
