package Codeforces;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            int left = 0;
            int right = s.length() - 1;
            while (a != b && left < right) {
                if(a>b){
                    if(s.charAt(left) == 'a'){
                        left++;
                    }else if(s.charAt(right) == 'a'){
                        right--;
                    }else{
                        left++;
                        b--;
                    }
                }else {
                    if(s.charAt(left) == 'b'){
                        left++;
                    }else if(s.charAt(right) == 'b'){
                        right--;
                    }else{
                        left++;
                        a--;
                    }
                }
            }
            System.out.println((left+1)+" "+(right+1));
        }
    }


}
