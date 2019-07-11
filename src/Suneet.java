import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author : codedsun
 * Created on 28/12/18
 */

public class Suneet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = 1;
        System.out.println(n);
    }

    private static void countDigit(int N) {
        if (N < 1) {
            return;
        } else {
            System.out.println(N);
            countDigit(N - 1);
            System.out.println(N);
            return;
        }
    }
}


//PRobLeM 459B
//public class Suneet {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(new Date());
//        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
//        long min = 1;
//        long max = 1;
//        long minCount = 0;
//        long maxCount = 0;
//        long[] beauty = new long[n];
//        for (int i = 0; i < n; i++) {
//            beauty[i] = sc.nextLong();
//            if (min > beauty[i]) {
//                min = beauty[i];
//            }
//
//            if (max < beauty[i]) {
//                max = beauty[i];
//            }
//        }
//
//        for(int i= 0;i <n ;i++){
//            if(beauty[i] == max){
//                maxCount++;
//            }
//            if(beauty[i] == min){
//                minCount++;
//            }
//        }
//        if(min == max){
//            System.out.println((max-min)+ " "+((minCount * maxCount-1) /2));
//        }else{
//            System.out.println((max-min)+ " "+(minCount * maxCount));
//        }
//    }
//
//}


//PROBLEM 467 B
//public class Suneet {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int k = sc.nextInt();
//
//        long[] x = new long[m + 1];
//        for (int i = 0; i <= m; i++) {
//            x[i] = sc.nextLong();
//        }
//
//        int noOfFriends = 0;
//        long number;
//        for (int i = 0; i < m; i++) {
//            number = x[i] ^ x[m]; //performs the xor operation
//            if(countOne(number) <= k){
//                noOfFriends++;
//            }
//        }
//
//        System.out.println(noOfFriends);
//
//    }
//
//    private static String getBinary(long x) {
//        String s = "";
//        while (x != 1) {
//            s = (x % 2) + s;
//            x = x / 2;
//        }
//        s = 1 + s;
//        return s;
//    }
//
//    private static int countOne(long n){
//        int c = 0;
//        while(n!=0){
//            n = n&n-1;
//            c++;
//        }
//        return c;
//    }
//
//}