import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        int a, b, c, d;
        while (t-- >= 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if (a == d) {
                System.out.println(b + " " + c);
            } else{
                System.out.println(a + " " + d);

            }
        }
    }

}
