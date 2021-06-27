package Codeforces;

import java.util.Scanner;

public class Problem237A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int lastHr = -1;
        int lastMin = -1;
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            if(hour == lastHr && min == lastMin){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 1;
            }
            lastHr = hour;
            lastMin = min;
        }
        System.out.println(maxCount);
    }
}
