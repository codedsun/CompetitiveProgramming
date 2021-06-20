package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Problem352B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println("1");
            System.out.println(ar[0] + " 0");
        } else {
            TreeMap<Integer, Set<Integer>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if(!map.containsKey(ar[i])){
                    Set<Integer> set = new HashSet<>();
                    set.add(i);
                    map.put(ar[i], set);
                }else{
                    map.get(ar[i]).add(i);
                }
            }
            TreeMap<Integer, Integer> ans = new TreeMap<>();
            map.forEach((integer, integers) -> {
                if(integers.size() == 1){
                    ans.put(integer, 0);
                }else{
                    int diff = -1;
                    boolean breakLoop = false;
                    Integer [] arr = integers.toArray(new Integer[]{});
                    for (int i = 1; i < arr.length; i++) {
                        if(diff == -1){
                            diff = arr[i]-arr[i-1];
                        }else{
                            if(arr[i]-arr[i-1] != diff){
                                breakLoop = true;
                                break;
                            }
                        }
                    }
                    if(!breakLoop){
                        ans.put(integer, diff);
                    }
                }
            });
            System.out.println(ans.size());
            ans.forEach((integer, integer1 )-> {
                System.out.println(integer+" "+integer1);
            });
        }
    }
}
