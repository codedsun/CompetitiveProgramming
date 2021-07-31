package Codeforces;

import java.util.Scanner;

public class Problem1466C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String s = sc.next();
            int total = 0;
            for (int i = 0; i < s.length() - 1; i++) {
               if(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                   total++;
                   if(i!=s.length()-2 && s.charAt(i)==s.charAt(i+2)){
                       total++;
                       i++;
                   }
                   i++;
               }else if(i!= s.length()-1 && i!=s.length()-2 && s.charAt(i)==s.charAt(i+2)){
                   total++;
                   if(i!=s.length()-3 && s.charAt(i+1)==s.charAt(i+3)) {
                       total++;
                       i++;
                   }
                   i=i+2;
               }

            }
            System.out.println(total);
        }
    }
}
