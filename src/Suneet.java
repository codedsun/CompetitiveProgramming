import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        while (t-- >= 1) {
            String s = sc.next();
            if(hashMap.containsKey(s)){
                System.out.println(s+""+hashMap.get(s));
                hashMap.put(s,hashMap.get(s)+1);
                hashMap.put(s+""+hashMap.get(s),1);
            } else{
                hashMap.put(s,1);
                System.out.println("OK");
            }
        }
    }

}
