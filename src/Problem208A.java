/**
 * @author : codedsun
 * Created on 03/01/19
 */

import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/208/A"/>
 */
public class Problem208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remixSong = sc.next(); //remix song
        remixSong = remixSong.replaceAll("(WUB)+", " ");
        remixSong = remixSong.trim();
        System.out.println(remixSong);
    }
}
