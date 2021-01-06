package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1381A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            ArrayList<Integer> operations = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((int)a.charAt(i) != (int)b.charAt(i)) {
                    if (i > 0) {
                        operations.add(i + 1);
                    }
                    operations.add(1);
                    if(i>0){
                        operations.add(i + 1);
                    }
                }
            }
            System.out.println(operations.toString());
        }
    }
}
