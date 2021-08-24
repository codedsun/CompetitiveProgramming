package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1560C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long no = sc.nextLong();
            if ((no & no - 1) == 0) {
                System.out.println("0");
            } else {
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i <= 60; i++) {
                    list.add((long)Math.pow(2,i)+"");
                }
                String no1 = no + "";
                int ans = Integer.MAX_VALUE;
                for (int i = 0; i <= 60; i++) {
                    String no2 = list.get(i);
                    int j = 0;
                    int k = 0;
                    int res = 0;
                    while (j < no1.length() && k < no2.length()) {
                        if (no1.charAt(j) == no2.charAt(k)) {
                            j++;
                            k++;
                        } else {
                            j++;
                            res++;
                        }
                    }
                    if (j == no1.length() && k != no2.length()) {
                        res = res + (no2.length() - k);
                    } else if (j != no1.length() && k == no2.length()) {
                        res = res + (no1.length() - j);
                    }
                    ans = Math.min(ans, res);
                }
                System.out.println(ans);
            }
        }
    }
}
