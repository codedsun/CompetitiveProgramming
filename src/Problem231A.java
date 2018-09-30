/**
 * @author : codedsun
 * Created on 30/09/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/231/A"/>
 */
public class Problem231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no of problems in the contest
        int view = 0;
        int count = 0; //the count of no of friends which are sure of the solution
        int problemsCount = 0; //the problems going to be implemented
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= 3; j++) {
                view = sc.nextInt();
                if (view == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                problemsCount++;
            }
        }

        System.out.println(problemsCount);
    }
}
