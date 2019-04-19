import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
public class Suneet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int two = sc.nextInt();
        int three = sc.nextInt();
        int five = sc.nextInt();
        int six = sc.nextInt();
        long totalSum = 0;
        while (two >= 1){
            if(five>=1 && six>=1){
                totalSum = totalSum+256;
                two--;
                five--;six--;
            }
            else if(two>=1 && three>=1){
                totalSum = totalSum+32;
                two--;
                three--;
            }else {
                two--;
            }
        }

        System.out.println(totalSum);
    }

}
