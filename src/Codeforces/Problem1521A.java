package Codeforces;

import java.util.Scanner;

public class Problem1521A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->=1){
            long  a= sc.nextLong();
            long b = sc.nextLong();
            long c = a*(b-1);
            long d = (a*b);
            long e = c+d;
            if(e%(a*b) != 0) {
                System.out.println("YES");
                System.out.println(c + " " + d+" " + e);
            }else{
                System.out.println("NO");
            }
        }
    }
}
