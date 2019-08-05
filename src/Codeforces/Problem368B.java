package Codeforces;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://codeforces.com/contest/368/problem/B"/>
 */
public class Problem368B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of elements in array
        int m = sc.nextInt(); //the m elements serejas wrote
        int a[] = new int[n]; //the array
        int q;
        int result[] = new int[n+1];
        Set<Integer> distinctElements = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //Pre process the array element

        for(int j=n-1;j >= 0; j--){
            distinctElements.add(a[j]);
            result[j] = distinctElements.size();
        }

        while (m-- >= 1) {
            q = sc.nextInt();
            System.out.println(result[q-1]);
        }

    }
}
