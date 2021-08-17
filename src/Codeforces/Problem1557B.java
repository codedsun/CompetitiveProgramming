package Codeforces;


import java.util.*;

public class Problem1557B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], i);
            }
            int c = 0;
            Iterator i = map.values().iterator();
            while(i.hasNext()){
               arr[c] = (int) i.next();
               c++;
            }
            c = 1;
            for (int j = 1; j < n; j++) {
                if(arr[j-1]+1 != arr[j]){
                    c++;
                }
            }
            if(c<=k){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
