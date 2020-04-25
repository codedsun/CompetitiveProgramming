package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1294C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            System.out.println(checkDivisibilty(sc.nextLong()));
        }
    }

    private static String checkDivisibilty(long n) {
        Set<Long> divisors = new HashSet<>();
        for(long i=2; i*i<n; i++) {
            if(divisors.size() == 2){
                break;
            }
            if(n%i==0){
                divisors.add(i);
                n= n/i;
            }
        }
        if(divisors.size()<2 || divisors.contains(n) || n ==1){
            return "NO";
        }else{
            divisors.add(n);
            return "YES\n"+divisors.toString().replaceAll("\\[","")
                    .replaceAll("]","")
                    .replaceAll(",","");
        }
    }
}
