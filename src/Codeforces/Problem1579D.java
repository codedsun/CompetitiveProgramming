package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1579D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            ArrayList<String> ans = new ArrayList<>();
            ArrayList<Long> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                integers.add(a);
            }
            int start = 0;
            int end = integers.size() - 1;
            while (start < end ) {
                if(integers.get(start) == 0){
                    start++;
                    continue;
                }else if(integers.get(end) == 0){
                    end--;
                    continue;
                }
                long i1 = integers.get(start);
                long i2 = integers.get(end);
                boolean endIndex = true;
                if (i1 < i2) {
                    endIndex = false;
                    long temp = i1;
                    i1 = i2;
                    i2 = temp;
                }
                for (int i = 0; i < i2; i++) {
                    ans.add((start + 1) + " " + (end + 1));
                }
                integers.set(start, integers.get(start) - i2);
                integers.set(end, integers.get(end) - i2);
                if (endIndex) {
                    end--;
                } else {
                    start++;
                }
            }
            System.out.println(ans.size());
            System.out.println(Arrays.toString(ans.toArray()));
        }
    }
}
