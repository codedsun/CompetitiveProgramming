package AtCoder.contest212;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2) && s.charAt(2) == s.charAt(3)){
            System.out.println("Weak");
        }else {
            //check for follows
            boolean weak = true;
            for (int i = 0; i < s.length()-1; i++) {
                int a = s.charAt(i)-48;
                int b = s.charAt(i+1)-48;
                if((a+1) % 10 != b %10){
                    weak = false;
                }

            }
            if(weak){
                System.out.println("Weak");
            }else{
                System.out.println("Strong");
            }
        }
    }
}
