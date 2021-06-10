package Codeforces;

import java.util.*;

public class Problem205A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long sorted[] = arr;
        long sort[] = sort(sorted, 0, n-1);
        boolean containDuplicate = false;
        for (int i = 1; i <n ; i++) {
            if(sort[i] == sort[i-1]){
                containDuplicate = true;
                break;
            }
        }
        if(containDuplicate){
            System.out.println("Still Rozdil");
        }else{
            int i;
            for (i= 0; i < n; i++) {
                if(arr[i] == sort[0]){
                    break;
                }
            }
            System.out.println(i+1);
        }

    }

    private static long[] sort(long arr[], int si, int ei) {
        if (si == ei) {
            return new long[]{arr[si]};
        }
        int mid = (si + ei) / 2;
        long[] first = sort(arr, si, mid);
        long[] second = sort(arr, mid + 1, ei);
        return merge(first, second);
    }

    private static long[] merge(long[] first, long[] second) {
        long merged[] = new long[first.length+ second.length];
        int k = 0;
        int l = 0;
        int m = 0;
        while(k<first.length && l< second.length){
            if(first[k]<second[l]) {
                merged[m] = first[k];
                k++;
            }else{
                merged[m] = second[l];
                l++;
            }
            m++;
        }
        while(k<first.length){
            merged[m] = first[k];
            k++;
            m++;
        }
        while(l< second.length){
            merged[m] = second[l];
            l++;
            m++;
        }
        return merged;
    }
}
