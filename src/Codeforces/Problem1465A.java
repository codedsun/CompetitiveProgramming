package Codeforces;

import java.util.Scanner;

public class Problem1465A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            int c=0, i;
            for (i = n - 1; i >= 0; i--) {
                if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                    break;
                }
                c++;
            }
            if(n-c<c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
