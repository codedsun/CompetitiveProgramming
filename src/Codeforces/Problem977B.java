package Codeforces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Problem977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= sc.next();
        HashMap<String,Integer> stringSet = new LinkedHashMap<>();
        String temp;
        int max = 0;
        String key="";
        for(int i=1; i<n; i++) {
            temp = s.charAt(i-1)+""+s.charAt(i);
            if(stringSet.containsKey(temp)){
                stringSet.replace(temp, stringSet.get(temp)+1);
                if(stringSet.get(temp)+1>max){
                    max = stringSet.get(temp)+1;
                    key = temp;
                }
            }else{
                stringSet.put(temp, 1);
                if(1 > max){
                    max = 1;
                    key = temp;
                }
            }
        }
        System.out.println(key);
    }
}
