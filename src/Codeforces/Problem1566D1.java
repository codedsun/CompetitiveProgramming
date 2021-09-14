package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1566D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n * m];
            for (int i = 0; i < n * m; i++) {
                arr[i] = sc.nextInt();
            }
            int con = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n * m; i++) {
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arr[i] > arrayList.get(j)) {
                        con++;
                    }
                }
                arrayList.add(arr[i]);
            }
            System.out.println(con);
        }
    }
}
