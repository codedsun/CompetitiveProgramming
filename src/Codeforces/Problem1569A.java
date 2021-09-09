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
            for (i = 0; i < s.length(); i++) {
                int cal = s.charAt(i) == 'a' ? 1 : -1;
                for (j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'a') {
                        cal++;
                    } else {
                        cal--;
                    }
                    if (cal == 0) {
                        break;
                    }
                }
                if (cal == 0) {
                    break;
                }
            }
            if (i == s.length() && j == s.length()) {
                i = -1;
                j = -1;
            } else {
                i++;
                j++;
            }
            System.out.println(i +" "+j);
        }
    }


}
