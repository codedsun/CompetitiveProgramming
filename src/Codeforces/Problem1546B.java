package Codeforces;

import java.util.Scanner;

public class Problem1546B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String arr[] = new String[n];
            String res[] = new String[n-1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            for (int i = 0; i < n-1; i++) {
                res[i] = sc.next();
            }
            String ans = "";
            for (int i = 0; i < n; i++) {
                char a = arr[i].charAt(m/2);
                boolean find = false;
                for (int j = 0; j < n-1; j++) {
                    char b = res[j].charAt(m/2);
                    if(a==b){
                        find = true;
                        break;
                    }
                }
                if(!find) {
                    ans = arr[i];
                    break;
                }
            }
            System.out.println(ans);
//            System.out.flush();
        }
    }
}
