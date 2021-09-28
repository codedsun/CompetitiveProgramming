package Codeforces;

import java.util.Scanner;

public class Problem1549A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1){
            long n = sc.nextLong();
            long rem = n%2;
            System.out.println("2"+" "+(n-rem));
        }
    }
}
