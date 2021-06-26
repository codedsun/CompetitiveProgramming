package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Problem236B {
    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    sum = sum+count(i*j*k);
                }
            }
        }
        System.out.println(sum%1073741824);
    }

    private static int count(int j){
        int count =0;
        if(map.containsKey(j)){
            return map.get(j);
        }
        for (int i = 1; i <= Math.sqrt(j); i++)
        {
            if (j % i == 0) {
                // If divisors are equal,
                // count only one
                if (j / i == i)
                    count++;

                else // Otherwise count both
                    count = count + 2;
            }
        }
        map.put(j, count);
        return count;
    }

}
