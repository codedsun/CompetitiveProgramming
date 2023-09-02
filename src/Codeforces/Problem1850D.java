package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            mergeSort(arr, 0, n-1);
            int max = 0;
            int elements = 0;
            for (int i = 1; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] <= k) {
                    elements++;
                    max = Math.max(max, elements);
                } else {
                    elements = 0;
                }
            }
//            System.out.println("inc"+elements);
            elements = 0;
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] - arr[i - 1] <= k) {
                    elements++;
                    max = Math.max(max, elements);
                } else {
                    elements = 0;
                }
            }
//            System.out.println("dec"+elements);
            System.out.println(n - max - 1);
        }
    }

    private static void mergeSort(int arr[], int be, int end) {
        if (be < end) {
            int mid = (be+end)/2;
            mergeSort(arr, be, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, be, mid, end);
        }
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

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
