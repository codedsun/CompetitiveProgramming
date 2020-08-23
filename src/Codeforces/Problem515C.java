package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/515/C"/>
 */
public class Problem515C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long digits = sc.nextInt();
        int marking[] = new int[]{
                -1, //0
                -1, //1
                2, //2
                3, //3
                322, //4
                5,//5
                53, //6
                7,//7
                7222,//8
                7332,//9
        };
        String n = sc.next();
        String number = "";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) != '0' &&  n.charAt(i)!='1') {
                number += (marking[Character.getNumericValue(n.charAt(i))]);
            }
        }
        int fNumber[] = new int[10];
        for(int i=0; i<number.length(); i++) {
            fNumber[Character.getNumericValue(number.charAt(i))]++;
        }
        number = "";
        String repeated;
        for(int i=9;i>0;i--) {
            if(fNumber[i]!=0){
                repeated = i+"";
                repeated =  new String(new char[fNumber[i]]).replace("\0", repeated);
                number = number+repeated;
            }
        }
        System.out.println(number);
    }
}
