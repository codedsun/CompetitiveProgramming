package Codeforces;

import java.util.Scanner;

public class Problem1520C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("1");
            } else if (n == 2) {
                System.out.println("-1");
            } else {
                int k = 1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(k>n*n){
                            k = 2;
                        }
                        System.out.print(k+" ");
                        k = k+2;
                    }
                    System.out.println();
                }
            }
        }
    }
}
