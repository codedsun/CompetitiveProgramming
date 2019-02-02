package Codeforces; /**
 * @author : codedsun
 * Created on 07/10/18
 */

import java.util.Scanner;

/**
 * <a href = "http://codeforces.com/problemset/problem/263/A" />
 */
public class Problem263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 3;//the desired column for 1
        int j = 3; //the desired row for 1
        int row1 = 0; //the original location(row) of 1 in the matrix
        int column1 = 0; //the original location(column) of 1 in the matrix
        for (int i1 = 1; i1 <= 5; i1++) {
            String s = sc.nextLine().replace(" ", "");
            if (s.contains("1")) {
                row1 = i1;
                column1 = s.indexOf("1") + 1;
                break;
            }

        }

        System.out.println(Math.abs(j - row1) + Math.abs(i - column1));
    }
}
