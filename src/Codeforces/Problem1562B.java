package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1562B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] prime = generatePrime();
        ArrayList<Integer> set = generateNonPrime(prime);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int k = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < set.size(); j++) {
                String no = set.get(j)+"";
                int count = 0;
                int index =0;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == no.charAt(index)){
                        count++;
                        index++;
                    }
                    if(count == no.length()){
                        break;
                    }
                }
                if(count == no.length()){
                    System.out.println(count);
                    System.out.println(no);
                    break;
                }
            }

        }
    }

    private static ArrayList<Integer> generateNonPrime(boolean[] prime) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        for (int i = 2; i < 1000000; i++) {
            if (!prime[i]) {
                set.add(i);
            }
        }
        return set;
    }

    private static boolean[] generatePrime() {
        boolean a[] = new boolean[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }

        for (int p = 2; p * p < a.length; p++) {
            if (a[p]) {
                for (int i = p * p; i < a.length; i += p) {
                    a[i] = false;
                }
            }
        }

        return a;
    }
}
