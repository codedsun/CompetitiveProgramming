package Codeforces;

import java.util.Scanner;

public class Problem1566B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String s = sc.next();
            long sum = 0;
            int c = -1;
            for (int i = 0; i < s.length(); i++) {
                if(c!= -1 && s.charAt(i)-48 == c){
                    continue;
                }else{
                    c = s.charAt(i)-48;
                    if(c==0){
                        sum = sum+1;
                    }
                }

            }
            if(sum>2){
                sum = 2;
            }
            System.out.println(sum);
        }
    }
}
