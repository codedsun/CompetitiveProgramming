package Codeforces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Problem166A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int value = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            count++;
            if(count == k){
                System.out.println(map.get(arr[i]));
                break;
            }
        }
    }
}
