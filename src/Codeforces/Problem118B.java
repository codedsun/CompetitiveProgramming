package Codeforces;

import java.util.Scanner;

public class Problem118B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        printRhombus(n);
    }

    private static void printRhombus(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i; j >=0 ; j--) {
                if(j==0){
                    System.out.print(j);
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >=0; i--) {
            for (int j = n; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                if(i == 0){
                    System.out.print(j);
                }else {
                    System.out.print(j + " ");
                }
            }
            for (int j = i-1; j >=0 ; j--) {
                if (j ==0){
                    System.out.print(j);
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
