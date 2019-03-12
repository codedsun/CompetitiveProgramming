import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
public class Suneet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        long prevsum = 0;
        int c = 0;
        int iter = t-2;
        while (t-- >= iter) {
            for (int i = 1; i <= t+1; i++) {
                sum = sum + sc.nextLong();
            }
            if (c == 0) {
                prevsum = sum;
                sum = 0;
            } else {
                System.out.println(prevsum-sum);
                prevsum = sum;
                sum = 0;
            }
            c++;
        }
    }

}
