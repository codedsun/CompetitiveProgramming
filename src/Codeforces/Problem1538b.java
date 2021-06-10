package Codeforces;

import java.util.Scanner;

public class Problem1538b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int avg = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                avg = avg+arr[i];
            }
            if(avg%n != 0){
                System.out.println("-1");
            }else{
                int ans = 0;
                avg = avg/n;
                for (int i = 0; i < n; i++) {
                    if(arr[i]>avg){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
