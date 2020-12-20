package Codeforces;

import java.util.Scanner;

public class Problem1462B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            int c =0;
            for (int i = 0; i <= 4; i++) {
                if ((s.substring(0, i) + s.substring(n - 4 + i, n))
                        .equalsIgnoreCase("2020")) {
                    c = 1;
                }
            }
            if(c==1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
