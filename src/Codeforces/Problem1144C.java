package Codeforces;

import java.util.*;

public class Problem1144C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt[] = new int[n+1];
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
            if(cnt[arr[i]]==2){
                count++;
            }
            max = Math.max(max, cnt[arr[i]]);
        }
        if(max>=3){
            System.out.println("NO");
            return;
        }else{
            System.out.println("YES");
        }
        System.out.println(count);
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 2) {
                System.out.print(i+" ");
                cnt[i]--;
            }
        }
        System.out.println();
        System.out.println(n-count);
        for (int i = n; i >=0; i--) {
            if(cnt[i]==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
