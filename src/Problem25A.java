/**
 * @author : codedsun
 * Created on 08/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/25/A"/>
 */
public class Problem25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the amount of number in the task
        int countEven = 0;
        int countOdd = 0;
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i < n; i++) {
            if ((sc.nextInt() % 2) == 0) {
                //even number
                countEven++;
                indexEven = i;
            } else {
                countOdd++;
                indexOdd = i;
            }

        }

        if (countEven == 1) {
            System.out.println(indexEven + 1);
        } else {
            System.out.println(indexOdd + 1);
        }
    }
}
