package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextLong());
            }
            long length = 0;
            long finalnumber = 0;
            for (int i = 0; i < n; i++) {
                long addingToBeg = (long) (Math.pow(10, length) * arr.get(i));
                long addingToEnd = (long) (Math.pow(10, 1) * finalnumber);
                if (addingToBeg + finalnumber > addingToEnd + arr.get(i)) {
                    finalnumber = addingToEnd + arr.get(i);
                } else {
                    finalnumber = addingToBeg + finalnumber;
                }
                length++;
            }
            ArrayList<Long> finalAns = new ArrayList<>();
            long ff = finalnumber;
            while (ff != 0) {
                finalAns.add(0, ff % 10);
                ff = ff / 10;
            }

            if (finalAns.size() == 0) {
                System.out.println(arr.get(0));
            } else {
                for (int i = 0; i < finalAns.size(); i++) {
                    System.out.print(finalAns.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}
