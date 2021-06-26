package Codeforces;

import java.util.Scanner;

public class Problem239A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        long k = sc.nextLong();
        long n = sc.nextLong();
        boolean printed= false;
        if(y >= n){
            System.out.println("-1");
        }else{
            double divi = y/k;
            int lowerbound = (int) Math.ceil(divi);
            int upperBound = (int) (n/k);
            if(lowerbound>upperBound){
                System.out.println("-1");
            }
            for(int i=lowerbound; i<=upperBound;i++){
                long x = (i*k)-y;
                if(x>=1 && x+y<=n){
                    System.out.print(x+" ");
                    printed = true;
                }else if(x+y>n){
                    break;
                }
            }
            if(!printed){
                System.out.println("-1");
            }
        }
    }
}
