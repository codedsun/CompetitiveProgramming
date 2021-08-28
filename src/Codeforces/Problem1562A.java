package Codeforces;

import java.util.Scanner;

public class Problem1562A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long ans = Integer.MIN_VALUE;
            l = Math.max(l,r/2);
            while (l < r) {
                ans = Math.max(ans, r % l);
                if(r%l<ans){
                    break;
                }
                l++;
            }
            if(ans == Integer.MIN_VALUE){
                ans = r%l;
            }
            System.out.println(ans);
        }
    }

}
