package Codeforces;

import java.util.Scanner;

public class Problem160B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String first = s.substring(0,n);
        String second = s.substring(n);
        String reverse = new StringBuilder(second).reverse().toString();
        //for first and second comparison
        boolean ans = findAns(first, second, n);
        boolean ansReverse = findAns(first, reverse, n);
        if(ans || ansReverse){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static boolean findAns(String first, String second, int n) {
        boolean ans = false;
        int firstElement = first.charAt(0)-48;
        int secondElement = second.charAt(0)-48;
        boolean greater = firstElement>secondElement;
        for (int i = 1; i < n; i++) {
            firstElement =  first.charAt(i)-48;
            secondElement = second.charAt(i)-48;
            if(greater){
                if(firstElement<=secondElement){
                    ans = false;
                    break;
                }else{
                    ans = true;
                }
            }else{
                if(firstElement>=secondElement){
                    ans = false;
                    break;
                }else{
                    ans = true;
                }
            }
        }
        return ans;
    }
}
