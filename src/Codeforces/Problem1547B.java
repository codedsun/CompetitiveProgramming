package Codeforces;

import java.util.Scanner;

public class Problem1547B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int xa = sc.nextInt();
            int xy = sc.nextInt();
            int yx = sc.nextInt();
            int yy = sc.nextInt();
            int fx = sc.nextInt();
            int fy = sc.nextInt();
            int steps = 0;
            if (xa == fx) {
                steps = steps + 4;
                steps = Math.abs(fy - xy) + Math.abs(yy - fy) + steps;
            } else if (xy == fy) {

            }
            System.out.println(steps);





//            String s = sc.next();
//            int index = s.indexOf("a");
//            if (index == -1) {
//                System.out.println("NO");
//            } else {
//                if (s.length() == 1 && s.charAt(0) == 'a') {
//                    System.out.println("YES");
//                } else {
//                    int b = 1;
//                    int startIndex = index - 1;
//                    int endIndex = index + 1;
//                    boolean loop = true;
//                    int count = 1;
//                    while (count<s.length()) {
//                        if (startIndex >= 0 && s.charAt(startIndex) == 'a' + b) {
//                            startIndex--;
//                            count++;
//                        } else if (endIndex < s.length() && s.charAt(endIndex) == 'a' + b) {
//                            endIndex++;
//                            count++;
//                        } else {
//                            loop = false;
//                            break;
//                        }
//                        b++;
//                    }
//                    if (!loop) {
//                        System.out.println("NO");
//                    } else {
//                        System.out.println("YES");
//                    }
//                }
//            }
        }
    }
}
