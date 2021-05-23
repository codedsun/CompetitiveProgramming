package Codeforces;

import java.util.Scanner;

public class Problem32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(parse(s));
    }

    public static String parse(String s) {
        char one = '.';
        char two = '-';
        String ans = "";
        for (int i = 0; i < s.length(); ) {
            if(i<=s.length()-2 && s.charAt(i) == two && s.charAt(i+1) == two){
                ans = ans+"2";
                i = i+2;
            }else if(i<=s.length()-2 && s.charAt(i) == two && s.charAt(i+1) == one){
                ans = ans+"1";
                i = i+2;
            }else if(s.charAt(i) == one){
                ans = ans+"0";
                i++;
            }else{
                i++;
            }
        }
        return ans;
    }
}
