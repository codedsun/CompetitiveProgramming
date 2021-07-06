package Codeforces;

import java.util.Scanner;

public class Problem1073A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String res = "";
        for (int i = 1; i < n; i++) {
            if(s.charAt(i)!= s.charAt(i-1)){
                res = res+s.charAt(i-1)+s.charAt(i);
                break;
            }
        }
        if(res.isEmpty()){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            System.out.println(res);
        }
    }
}
