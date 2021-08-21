package Codeforces;

import java.util.Scanner;

public class Problem1560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[1001];
        perform(arr);
        while (t-- >= 1) {
            int n= sc.nextInt();
            System.out.println(arr[n-1]);
        }
    }

    private static void perform(int arr[]) {
        int index = 0;
        int count = 1;
        while (index < 1000) {
            if (count % 3 != 0 && count%10 !=3) {
                arr[index] = count;
                index++;
            }
            count++;
        }
    }
}
