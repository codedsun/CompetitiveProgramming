package Codeforces;

import java.util.Scanner;

public class Problem1560B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (a > b) {
                long te = a;
                a = b;
                b = te;
            }
            long diff = b - a;
            if (diff == 1) {
                System.out.println("-1");
            } else {
                long totalElements = ((diff - 1) * 2) + 2;
                if(c>totalElements || b>totalElements ){
                    System.out.println("-1");
                }else{
                    if(c+diff<=totalElements) {
                        System.out.println(c + diff);
                    }else if(c-diff>=0){
                        System.out.println(c-diff);
                    }else{
                        System.out.println("-1");
                    }
                }
            }

        }
    }
}
