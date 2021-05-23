package Codeforces;

import java.util.Scanner;

public class Problem141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        String permuted = sc.next();
        if (name1.length() + name2.length() == permuted.length()) {
            char [] names = new char[26];
            char [] ans = new char[26];
            for (int i = 0; i < name1.length(); i++) {
                names[name1.charAt(i)-65]++;
            }

            for (int i = 0; i < name2.length(); i++) {
                names[name2.charAt(i)-65]++;
            }

            for (int i = 0; i < permuted.length(); i++) {
                ans[permuted.charAt(i)-65]++;
            }
            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                if(names[i] != ans[i]){
                    flag =true;
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}
