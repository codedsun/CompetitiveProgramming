/**
 * @author : codedsun
 * Created on 17/12/18
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "http://codeforces.com/problemset/problem/160/A/>
 */
public class Problem160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0; //the sum of the coins
        int minCoins = 0;
        int minCoinsSum = 0;
        int coins[] = new int[n]; //these are the individual coins
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            sum = sum + coins[i];
        }

        Arrays.sort(coins);
        for (int j = n - 1; j >= 0; j--) {
            minCoinsSum = minCoinsSum + coins[j];
            if (minCoinsSum > (sum - minCoinsSum)) {
                minCoins++;
                break;
            }
            minCoins++;
        }
        System.out.println(minCoins);
    }
}
