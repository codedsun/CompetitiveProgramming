package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1206B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a;
        ArrayList<Long> minus = new ArrayList<>();
        ArrayList<Long> plus = new ArrayList<>();
        ArrayList<Long> zero = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a = sc.nextLong();
            if (a < 0) {
                minus.add(a);
            } else if (a == 0) {
                zero.add(a);
            } else {
                plus.add(a);
            }
        }
        a = 0;
        for (int j = 0; j < plus.size(); j++) {
            a = a + (plus.get(j) - 1);
        }

        for (int k = 0; k < minus.size(); k++) {
            a = a + (-1 - minus.get(k));

        }
        if(zero.size()>0) {
            a = a + zero.size();
        }else if(minus.size()%2==1){
            a = a+2;
        }
        System.out.println(a);

    }
}
