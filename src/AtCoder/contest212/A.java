package AtCoder.contest212;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b>0) {
            System.out.println("Silver");
        }else if(b==0 && a>0) {
            System.out.println("Gold");
        }else{
            System.out.println("Alloy");
        }

    }
}
