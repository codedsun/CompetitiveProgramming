import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : codedsun
 * Created on 28/12/18
 */

public class Suneet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the
        int a[] = new int[n];
        int m = sc.nextInt(); // the m queries
        Set<Integer> set = new LinkedHashSet<>();
        int distinct[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int j = n-1; j>=0;j--){
            set.add(a[j]);
            distinct[j] = set.size();
        }

        while(m -- >= 1){
            System.out.println(distinct[sc.nextInt()-1]);
        }


    }

}