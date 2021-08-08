package AtCoder.twoonethree;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] b = arr.clone();
        Arrays.sort(b);
        int i = 0;
        for (i = 0; i < n; i++) {
            if(arr[i] == b[b.length-2]) {
                break;
            }
        }
        System.out.println(i+1);
    }
}