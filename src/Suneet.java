import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
public class Suneet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> stringMap = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s, s1;
        StringBuilder result = new StringBuilder();
        while (m-- >= 1) {
            s = sc.next();
            s1 = sc.next();
            stringMap.put(s, (s.length() <= s1.length()) ? s : s1);
        }

        while(n-->=1){
            result.append(stringMap.get(sc.next()));
            result.append(" ");
        }
        System.out.println(result.toString().trim());

    }

}
