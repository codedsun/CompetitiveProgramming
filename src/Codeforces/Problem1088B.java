package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1088B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] > 0) {
                index = i;
                break;
            }
        }
        long sum = 0;
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < k; i++) {
            if (index < n) {
                arr[index] = arr[index] - sum;
                sum = sum + arr[index];
                if (arr[index] <= 0) {
                    if (index + 1 < n) {
                        for (int j = index + 1; j < n; j++) {
                            if (arr[j]-sum > 0) {
                                index = j;
                                break;
                            }else{
                                index++;
                            }
                        }
                        if(index<n) {
                            arr[index] = arr[index] - sum;
                            sum = sum + arr[index];
                            System.out.println(arr[index]);
                            index++;
                        }
                        else{
                            System.out.println("0");
                        }
                    } else {
                        System.out.println("0");
                    }
                } else {
                    System.out.println(arr[index]);
                    index++;
                }
            }else{
                System.out.println("0");
            }
        }
    }
}
