/**
 * @author : codedsun
 * Created on 16/12/18
 */

import java.util.Scanner;

/**
 * <a href= "http://codeforces.com/problemset/problem/116/A"/>
 */
public class Problem116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of stops of the tram
        int a, b;
        int current = 0; //indicates the current no of people in the tram
        int minCapacity = 0; //the min capacity of the tram

        while (n-- >= 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            current = b + (current - a);
            if (current > minCapacity) {
                minCapacity = current;
            }
        }
        System.out.println(minCapacity);

    }
}
