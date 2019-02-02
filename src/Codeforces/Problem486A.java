package Codeforces; /**
 * @author : codedsun
 * Created on 24/12/18
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.Scanner;

import static java.lang.Math.ceil;

/**
 * <a href="https://codeforces.com/problemset/problem/486/A"/>
 */
public class Problem486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double oddTerms = Math.ceil(n / 2);
        double evenTerms = n - oddTerms;
        BigDecimal oddSum = BigDecimal.valueOf(oddTerms*oddTerms);
        BigDecimal evenSum = BigDecimal.valueOf((evenTerms * evenTerms) + evenTerms);
        System.out.println((oddSum.add(evenSum)).longValueExact());
    }
}
