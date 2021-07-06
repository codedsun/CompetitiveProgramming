package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1073B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] books = new int[n+1];
        for (int i = 1; i <= n; i++) {
            books[i] = sc.nextInt();
        }
        int [] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = sc.nextInt();
        }
        int track = 0;
        boolean[] u = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            if(track == n || u[(steps[i])]){
                System.out.print("0 ");
            }else{
                int position = getPosition(track, u, books, steps[i]);
                System.out.print(position-track+" ");
                track = position;
            }
        }
    }

    private static int getPosition(int track, boolean[] u, int[] books, int element) {
        for (int i = track; i <=books.length ; i++) {
            u[books[i]] = true;
            if(books[i] == element){
                return i;
            }
        }
        return -1;
    }
}