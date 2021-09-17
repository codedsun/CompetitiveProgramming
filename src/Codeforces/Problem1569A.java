package Codeforces;

import java.util.Scanner;

public class Problem1569A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = 0;
            if (n == 1) {
                i = -1;
                j = -1;
            } else {
                char ch = s.charAt(i);
                i = 0;
                boolean find = false;
                for (int k = 1; k < n; k++) {
                    if(ch != s.charAt(k)){
                        j = k;
                        find = true;
                        break;
                    }else{
                        i++;
                    }
                }
                i++;
                j++;
                if(!find){
                    i = -1;
                    j = -1;
                }
            }
            System.out.println(i+" "+j);
        }
    }


}
