package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/1092/B"/>
 */
public class Problem1092B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n]; //skill set of students
        int count = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);//quick sort o(nlogn)
        for(int i=0; i<n-1; i++){
            count += a[i+1]-a[i];
            i++; //skip that student as it has been considered in a team
        }
        System.out.println(count);

    }
}
