package Codeforces;

import java.util.Scanner;

public class Problem219A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        char [] ch = new char[26];
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i)-'a']++;
        }
        boolean possible = true;
        for (int i = 0; i < 26; i++) {
            if(ch[i] != 0 && ch[i]%k != 0){
                possible = false;
                break;
            }
        }
        if(!possible){
            System.out.println("-1");
        }else{
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < 26; j++) {
                    if(ch[j]!=0) {
                        System.out.print((char)(j+'a'));
                    }
                }
            }
        }
    }
}
