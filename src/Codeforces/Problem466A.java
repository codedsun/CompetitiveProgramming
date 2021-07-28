package Codeforces;

import java.util.Scanner;

public class Problem466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        float aRides = n*a;
        double bRide=Math.ceil(b/m);
        float bRides = (float) (n*bRide);
        float ans = Math.min(aRides, bRides);
        int aa = (int) Math.ceil(ans);
        System.out.println(aa);

    }
}
