/**
 * @author : codedsun
 * Created on 08/01/19
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://codeforces.com/problemset/problem/443/A"/>
 */
public class Problem443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("{","");
        s = s.replace("}","");
        s = s.replaceAll(", ","");
        s = s.trim();
        Set<Character> characterSet = new LinkedHashSet<>();
        for(int i = 0; i < s.length(); i++){
            characterSet.add(s.charAt(i));
        }
        System.out.println(characterSet.size());
    }
}
