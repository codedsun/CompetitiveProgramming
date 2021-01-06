package Codeforces;

import java.util.Scanner;

public class Problem1B {
    private static char character[] = new char[]{'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static String az = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            String s = sc.next();
            if (s.charAt(0) == 'R' && Character.isDigit(s.charAt(1))) {
                //R23C55
                convertToCYRX(s);
            } else {
                //BC23
                convertToRXCY(s);
            }
        }
    }

    private static void convertToRXCY(String s) {
        int indexOfDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                indexOfDigit = i;
                break;
            }
        }
        String columnNumber = s.substring(0, indexOfDigit);
        String rowNumber = s.substring(indexOfDigit);
        int pow = 0;
        long val = 0;
        for (int i = columnNumber.length() - 1; i >= 0; i--) {
            val = (long) (val + (Math.pow(26, pow) * ((int) az.indexOf(columnNumber.charAt(i)) + 1)));
            pow++;
        }
        System.out.println("R" + rowNumber + "C" + val);
    }

    private static void convertToCYRX(String s) {
        String rowNumber = s.substring(1, s.indexOf('C'));
        long colNumber = Long.parseLong(s.substring(s.indexOf('C') + 1));
        String finalString = "";
        while (colNumber != 0) {
            if (colNumber % 26 == 0) {
                finalString = "Z" + finalString;
                colNumber = colNumber / 26;
                colNumber--;
            } else {
                finalString = character[(int)colNumber % 26 - 1] + finalString;
                colNumber = colNumber / 26;
            }

        }
        finalString = finalString + rowNumber;
        System.out.println(finalString);
    }
}
