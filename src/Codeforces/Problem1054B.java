package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class Problem1054B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 0;
        int max = -1;
        boolean br = false;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[0] != 0) {
                br = true;
                break;
            } else {
                if (arr[i] >= min && arr[i]<=max+1) {
                    max = Math.max(max, arr[i]);
                    min = Math.min(min, arr[i]);
                }else{
                    br = true;
                    break;
                }
            }
        }
        if (i == n) {
            System.out.println("-1");
        } else {
            System.out.println(i + 1);
        }

    }
}
