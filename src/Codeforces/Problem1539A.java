package Codeforces;

import java.util.Scanner;

public class Problem1539A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k-- >= 1) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long t= sc.nextLong();
            long ans = Math.min(n-1,t/x);
            if(ans == 0){
                System.out.println(ans);
            }else{
                long ans1 = Math.max(0, ans*(ans-1)/2)+ ans*(n-ans);
                System.out.println(ans1);
            }
        }
    }
}
