package Codeforces;

import java.util.Scanner;

public class Problem253A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //boys
        int m = sc.nextInt(); //girls
        while(m-->=1 && n-->=1){
            if(m>n) {
                System.out.print("GB");
            }else{
                System.out.print("BG");
            }
        }
        while(m-->=1){
            System.out.print("G");
        }
        while(n-->=1){
            System.out.print("B");
        }
    }
}
