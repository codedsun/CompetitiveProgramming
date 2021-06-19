package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem218B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = 0;
        int max = 0;
        int index = 0;
        int n1= n;
        while(n1 != 0) {
            if(n1-arr[index]>=0) {
                n1 = n1-arr[index];
                min = min+((arr[index]*(arr[index]+1))/2);
                arr[index] = 0;
                index++;
            }else{
                n1--;
                min = min+arr[index];
                arr[index]--;
            }
        }
        n1 = n;
        index = m-1;
        while(n1 != 0) {

        }
        System.out.println(min);

    }
}
