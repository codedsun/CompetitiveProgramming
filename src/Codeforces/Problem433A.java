package Codeforces;

import java.util.Scanner;

public class Problem433A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hundred = 0;
        int two = 0;int a;
        while(n-->=1){
            a = sc.nextInt();
            if(a == 100){
                hundred++;
            }else{
                two++;
            }
        }
        //
        if(hundred%2 == 0 && two % 2 ==0){
            System.out.println("YES");
        }else {
            //odd odd
            if(hundred%2!=0 && two%2 !=0) {
                System.out.println("NO");
            }else if(hundred%2 != 0) {
                //100 odd 200even
                System.out.println("NO");
            }else {
                //100 even 200 odd
                if(hundred!=0 && two!=0 &&Math.abs(hundred-two)%2==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}
