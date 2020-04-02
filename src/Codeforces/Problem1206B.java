package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * <a href="https://codeforces.com/problemset/problem/1206/B"/>
 */
public class Problem1206B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); //no of items

        List<Long> zeros = new ArrayList<>();
        List<Long> positiveNumbers = new ArrayList<>();
        List<Long> negativeNumbers = new ArrayList<>();

        long inputtedNumber;

        for (int i = 0; i < n; i++) {
            inputtedNumber = sc.nextInt();
            if (inputtedNumber > 0) {
                positiveNumbers.add(inputtedNumber);
            } else if (inputtedNumber == 0) {
                zeros.add(inputtedNumber);
            } else {
                negativeNumbers.add(inputtedNumber);
            }
        }

        long costOfCoins = 0;
        for (int i = 0; i < positiveNumbers.size(); i++) {
            costOfCoins = costOfCoins + (positiveNumbers.get(i) - 1);
        }

        for (int i = 0; i < negativeNumbers.size(); i++) {
            costOfCoins = costOfCoins + (-1 - negativeNumbers.get(i));
        }

        if (zeros.size() > 0) {
            costOfCoins = costOfCoins + zeros.size();
        } else if (negativeNumbers.size() % 2 == 1) {
            costOfCoins = costOfCoins + 2;
        }

        System.out.println(costOfCoins);

    }
}
