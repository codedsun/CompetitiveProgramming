package Codeforces;

import java.util.Scanner;

public class Problem1051B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        System.out.println("YES");
        for(long c = l; c<r;c=c+2){
            System.out.println(c+" "+(c+1));
        }
    }
}
