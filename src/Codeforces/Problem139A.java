package Codeforces;

import java.util.Scanner;

public class Problem139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pages = sc.nextInt();
        int read[] = new int[7];
        int index = -1;
        int sum = 0;
        for (int i = 0; i <= 6; i++) {
            read[i] = sc.nextInt();
        }
        int i = 0;
        while (sum <= pages) {
            sum = sum + read[i];
            if(sum>=pages){
                break;
            }
            i++;
            if (i == 7) {
                i = 0;
            }
        }
        System.out.println(i + 1);
    }
}
