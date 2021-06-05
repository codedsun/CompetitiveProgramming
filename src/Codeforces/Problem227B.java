package Codeforces;

import java.util.Scanner;

public class Problem227B {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[1000005];
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int petya=0;
        int vasya=0;
        while (m-- > 0) {
            int q = sc.nextInt();
            petya+= n-arr[q]+1;
            vasya+=arr[q];
        }
        System.out.println(vasya+" "+petya);
    }

}
