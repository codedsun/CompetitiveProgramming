/**
 * @author : codedsun
 * Created on 16/01/19
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/268/A"/>
 */
public class Problem268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> homeDress = new ArrayList<>();
        ArrayList<Integer> guestDress = new ArrayList<>();
        int changeCount = 0;
        while (n-- >= 1) {
            homeDress.add(sc.nextInt());
            guestDress.add(sc.nextInt());
        }
        for (int i = 0; i < homeDress.size(); i++) {

            for (int j = 0; j < guestDress.size(); j++) {
               if(guestDress.get(j) == homeDress.get(i)){
                   changeCount++;
               }
            }
        }
        System.out.println(changeCount);
    }
}
