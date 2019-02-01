/**
 * @author : codedsun
 * Created on 01/02/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/705/A"/>
 */
public class Problem705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oddFeeling = "I hate ";
        String evenFeeling = "I love ";
        String endingLetter = "it";
        String middleCharacter = "that ";
        int n = sc.nextInt();
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result = result + evenFeeling;
            } else {
                result = result + oddFeeling;
            }
            if(i==n){
                result = result + endingLetter;
            } else {
                result = result + middleCharacter;
            }
        }
        result = result.trim();

        System.out.println(result);
    }
}
