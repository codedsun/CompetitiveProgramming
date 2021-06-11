package Codeforces;

import java.util.Scanner;

public class Problem320A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean yes = true;
        for (int i = 0; i < s.length();) {
            if(i+2 < s.length() && s.charAt(i) == '1' && s.charAt(i+1) == '4' && s.charAt(i+2)=='4') {
                i = i+3;
            }else if(i+1 < s.length() && s.charAt(i) == '1' && s.charAt(i+1) == '4'){
                i = i+2;
            }else if(s.charAt(i) == '1'){
                i = i+1;
            }else{
                yes = false;
                break;
            }
        }
        if(yes) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
