package Codeforces;

import java.util.Scanner;

public class Problem165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xy[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xy[i][0] = x;
            xy[i][1] = y;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int l=0,r=0,d=0,u = 0;
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                if(xy[j][0] == xy[i][0] && xy[j][1]>xy[i][1]){
                    //y above
                    u++;
                }else if(xy[j][0] == xy[i][0] && xy[j][1]<xy[i][1]){
                    //y below
                    d++;
                }else if(xy[j][1] == xy[i][1] && xy[j][0]>xy[i][0]) {
                    //x above
                    r++;
                }else if(xy[j][1] == xy[i][1] && xy[j][0]<xy[i][0]){
                    //x below
                    l++;
                }
            }
            if(u>0 && l>0 && r>0 && d>0){
                count++;
            }
        }
        System.out.println(count);

    }
}
