import java.io.*;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        long a, b;
        while (t-- >= 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b != 0) {
                System.out.println(a / b + " " + ((a - (a / b) * b)));
            } else {
                System.out.println(b + " " + a);
            }
        }
    }

}
