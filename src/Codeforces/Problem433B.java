package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem433B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n+1];
        long z[] = new long[n+1];
        long sortedarry[] = new long[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextLong();
            z[i] = arr[i];
            sortedarry[i] = arr[i];

        }
        sortedarry = sort(sortedarry, 0,n);
        for (int i = 1; i <=n; i++) {
            z[i] += z[i-1];
            sortedarry[i]+=sortedarry[i-1];
        }
        int m = sc.nextInt();
        int ques,l,r;
        while(m-->=1) {
            ques = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            switch (ques) {
                case 1: {
                    System.out.println(z[r]-z[l-1]);
                    break;
                }
                case 2: {
                    System.out.println(sortedarry[r]-sortedarry[l-1]);
                    break;
                }
            }
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
