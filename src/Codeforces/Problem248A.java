package Codeforces;

import java.util.Scanner;

public class Problem248A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] leftRight = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                leftRight[i][j] = sc.nextInt();
            }
        }

        //left count
        int c1 = 0,c0=0, t=0;
        for (int i = 0; i < n; i++) {
            if(leftRight[i][0] == 0){
                c0++;
            }else{
                c1++;
            }

        }
        t = t+Math.min(c0,c1);
        c1 = 0;c0=0;
        for (int i = 0; i < n; i++) {
            if(leftRight[i][1] == 0){
                c0++;
            }else{
                c1++;
            }
        }
        t = t+Math.min(c0,c1);

        System.out.println(t);

    }
}
