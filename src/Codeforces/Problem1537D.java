package Codeforces;

import java.util.Scanner;

public class Problem1537D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1){
            long n = sc.nextLong();
            int count = 1;
            long div = 0;
            while(n>1 && n%2 == 0){
                div = n/2;
                if(div>1 && div<n) {
                    n = n - div;
                    count++;
                    System.out.println(n+" "+count);
                }else{
                    break;
                }
            }
            if(count%2 == 0){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
        }
    }
}
