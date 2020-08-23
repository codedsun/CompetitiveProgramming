package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;
import java.util.function.BiConsumer;

public class Problem1363B {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        String one = "101";
        String zero = "010";
        HashMap<Integer, Integer> a= new LinkedHashMap<>();
        a.forEach((integer, integer2) -> {

        });
        while(t-- >=1){
            int i1=0,i2=0;
            String s = fr.nextLine();
            for(int i=0; i<s.length(); i++){
                if(i1<3 && s.charAt(i)==one.charAt(i1)){
                    i1++;
                }else if( i2<3 && s.charAt(i)==zero.charAt(i2)){
                    i2++;
                }
            }

            System.out.println(i1 + " "+i2);
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
