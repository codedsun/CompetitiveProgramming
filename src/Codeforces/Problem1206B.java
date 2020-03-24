package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1206B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        List<Long> minus = new ArrayList<>();
        List<Long> plus = new ArrayList<>();
        List<Long> zeros = new ArrayList<>();
        long count =0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i]<0){
                minus.add(a[i]);
            }else if(a[i]==0){
                zeros.add(a[i]);
            }else{
                plus.add(a[i]);
            }
        }
        if(minus.size()%2==0){
            for(int i=0; i<minus.size();i++){
                count = count+ -1-(minus.get(i));
            }
        }else{
            for(int i=0; i<minus.size()-1;i++){
                count = count+ -1-(minus.get(i));
            }
            count = count+1-minus.get(minus.size()-1);
        }
        count += (zeros.size());
        for(int i=0; i<plus.size();i++){
            count+= plus.get(i)-1;
        }
        System.out.println(count);

    }
}
