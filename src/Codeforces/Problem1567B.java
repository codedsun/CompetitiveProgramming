package Codeforces;

import java.util.Scanner;

public class Problem1567B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xor = 0;
            int length = a;
            for (int i = 1; i < a; i++) {
                xor = xor ^ i;
            }
            System.out.println(xor);
            if (xor != b) {
                if (a == 1 && b == 1) {
                    length = length + 2;
                } else {
                    if(xor == 1 && b!=0){
                        length = length+2;
                    }else{
                        length = length+1;
                    }
                }
            }
            System.out.println(length);
        }
    }
}
