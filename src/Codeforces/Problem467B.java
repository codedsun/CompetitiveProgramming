package Codeforces;


import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/467/B"/>
 */
public class Problem467B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(); //the type of soldiers
        int m = sc.nextInt(); //the no of soldiers
        int k = sc.nextInt(); //the value for which x can be fedor's friend

        //as their are 1 to m+1 soldiers
        long soldiers[] = new long[m+1]; //army of every player
        for(int i = 0; i<=m;i++){
            soldiers[i] = sc.nextInt();
        }

        int count = 0; //the no of friends of fedor
        long res = 0;
        for(int i =0 ;i <m; i++){
            res = soldiers[i]^soldiers[m];
            if(countOne(res)<=k){
                count++;
            }
        }

        System.out.println(count);
    }

    private static int countOne(long n){
        int c= 0;
        while(n!=0){
            n = n&n-1;
            c++;
        }
        return c;
    }
}
