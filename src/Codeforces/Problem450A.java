package Codeforces;

import java.util.Scanner;

public class Problem450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int ceil = (int) Math.ceil(arr[i] / m);
            if (ceil >= max) {
                max = ceil;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);

    }
}
