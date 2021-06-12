package Codeforces;

import java.util.Scanner;

public class Problem214A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 0;
        int b = 0;

        int soln = 0;
        int count = 0;
        int solm = 0;
        while(solm<m && soln<n) {
            soln = (a*a)+b;
            solm = (a)+(b*b);
            if (soln == n && solm == m){
                count++;
            }
            else if(soln<n){
                a++;
            }else if(solm<m){
                b++;
            }
        }
        System.out.println(count);
    }
}
