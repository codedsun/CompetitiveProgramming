package Codeforces;

/**
 * @author : codedsun
 * Created on 05/02/19
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/4/C"/>
 */
public class Problem4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<String, Integer> userNames = new HashMap<>();
        String inputtedUsername;
        while (n-- >= 1) {
            inputtedUsername = sc.next();
            if (userNames.containsKey(inputtedUsername)) {
                System.out.println(inputtedUsername+""+userNames.get(inputtedUsername));
                userNames.put(inputtedUsername+""+userNames.get(inputtedUsername),1);
                userNames.put(inputtedUsername,userNames.get(inputtedUsername)+1);
            } else {
                userNames.put(inputtedUsername, 1);
                System.out.println("OK");
            }
        }
    }
}
