package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1833B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->=1) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];
            int aInit[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                aInit[i] = i;
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            mergeSort(a, 0, n-1);
            mergeSort(b, 0, n-1);
            long res[] = new long[n];
            System.out.println(Arrays.toString(aInit));
            for (int i = 0; i < n; i++) {
                res[aInit[i]] = b[i];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }

    private static void mergeSort(long arr[], int start, int end) {
        if (start<end) {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(long arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        long L[] = new long[n1];
        long R[] = new long[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
