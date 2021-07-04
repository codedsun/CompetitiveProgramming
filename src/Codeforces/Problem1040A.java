package Codeforces;

import java.util.Scanner;

public class Problem1040A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int white = sc.nextInt();
        int black = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        boolean c = false;
        for (int i = 0; i < n/2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                if (arr[i] == 2 && arr[n - i - 1] == 2) {
                    //need to buy
                    sum = sum + (Math.min(white, black)* 2L);
                } else if (arr[i] == 2) {
                    sum = sum+getcost(arr[n-i-1],white, black);
                }else if(arr[n-i-1] == 2){
                    sum = sum+getcost(arr[i],white, black);
                }else{
                    c = true;
                    break;
                }
            }else if (arr[i] == 2 && arr[n - i - 1] == 2) {
                //need to buy
                sum = sum + (Math.min(white, black)* 2L);
            }
        }
        if(!c && n%2 != 0){
            if(arr[(n/2)] == 2){
                sum = sum+Math.min(white, black);
            }
        }
        if(c){
            System.out.println("-1");
        }else{
            System.out.println(sum);
        }
    }

    private static int getcost(int i, int white, int black) {
        switch (i) {
            case 0:
                return white;
            case 1:
                return black;
            default:
                return 0;
        }
    }
}
