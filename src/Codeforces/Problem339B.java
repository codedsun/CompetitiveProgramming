package Codeforces;

import java.util.Scanner;

public class Problem339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int initialHouse = 1;
        long count = 0;
        for (int i = 0; i < m; i++) {
            count = count+((arr[i]-initialHouse)+n)%n;
            initialHouse = arr[i];
        }
        System.out.println(count);
    }
}
