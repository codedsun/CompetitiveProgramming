package Codeforces;

import java.util.Scanner;

public class Problem353A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumA = 0;
        int sumB = 0;
        int a, b;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            sumA+=a;
            sumB+=b;
        }

        if(sumA%2 ==0 && sumB%2==0){
            System.out.println("0");
        }else if(n == 1){
            System.out.println("0");
        }else  {
            //sumB is odd, find the odd element in A
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][0] == 1 || arr[i][0] == 3 || arr[i][0] == 5) {
                    sumA = sumA - arr[i][0];
                    sumB = sumB - arr[i][1];
                    sumA = sumA + arr[i][1];
                    sumB = sumB + arr[i][0];
                    count++;
                    if (sumA % 2 == 0 && sumB % 2 == 0) {
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("-1");
            } else {
                System.out.println(count);
            }

        }


    }
}
