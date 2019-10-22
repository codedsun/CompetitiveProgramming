import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 28/12/18
 */


public class Suneet {
    public static void main(String[] args) {
        String s=  "https://www.pinterest.com/suneetbond/";
        System.out.println(s.substring(26,s.length()-1));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            b[i] = a[i];
//        }
//        int c;
//        for (int i = 1; i < n; i++) {
//            if (a[i - 1] > a[i]) {
//                c = a[i - 1];
//                a[i - 1] = a[i];
//                a[i] = c;
//            }
//        }

    }
}


//PROBLEM FENCE

//public class Suneet {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        int windowSum = 0;
//        int indexMin = k-1;
//
//        for (int j = 0; j < k; j++) {
//            sum = sum + a[j];
//        }
//
//        windowSum = sum;
//        for (int i = k; i < n; i++) {
//            windowSum = windowSum + a[i] - a[i - k];
//            if(windowSum<sum){
//                sum = windowSum;
//                indexMin = i;
//            }
//        }
//        System.out.println(indexMin+1-k+1);
//
//    }
//
//}