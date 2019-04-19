package Codeforces;

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/734/B"/>
 */

public class Problem734B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int twoDigitCount = sc.nextInt();
        int threeDigitCount = sc.nextInt();
        int fiveDigitCount = sc.nextInt();
        int sixDigitCount = sc.nextInt();
        long sum = 0; //the total sum

        while (twoDigitCount >= 1) {
            //check for 256
            if (fiveDigitCount >= 1 && sixDigitCount >= 1) {
                sum = sum + 256;
                twoDigitCount--;
                fiveDigitCount--;
                sixDigitCount--;
            }
            else if(twoDigitCount>=1 && threeDigitCount>=1){
                //Checking for 32
                sum = sum+32;
                twoDigitCount--;
                threeDigitCount--;
            }else{
                //Falling from the negation of the above condition
                break;
            }
        }
        System.out.println(sum);

    }
}
