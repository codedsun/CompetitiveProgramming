package Codeforces;

import java.util.Scanner;

public class Problem352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countzero = 0;
        int countfive = 0;
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if(ar[i] == 5){
                countfive++;
            }else{
                countzero++;
            }
        }
        if(countzero == 0){
            System.out.println("-1");
        }else if(countfive<9){
            System.out.println("0");
        }
        else{
            for (int i = 0; i < countfive/9; i++) {
                System.out.print("555555555");
            }
            for (int i = 0; i < countzero; i++) {
                System.out.print("0");
            }
        }
    }
}
