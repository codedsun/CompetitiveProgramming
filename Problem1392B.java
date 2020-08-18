import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1392B {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0){
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            long k = Long.parseLong(s[1]);
            int[] ans1 = new int[N];
            String[] s1 = br.readLine().split(" ");
            for(int i=0;i<N;i++){
                ans1[i]=Integer.parseInt(s1[i]);
            }
            int max1=ans1[0];
            for(int i=0;i<N;i++){
                if(ans1[i]>max1){
                    max1=ans1[i];
                }
            }
            for(int i=0;i<N;i++){
                ans1[i]=max1-ans1[i];
            }
            if(k%2==0){
                int max2=ans1[0];
                for(int i=0;i<N;i++){
                    if(ans1[i]>max2){
                        max2=ans1[i];
                    }
                }
                int[] ans2=new int[N];
                for(int i=0;i<N;i++){
                    ans2[i]=max2-ans1[i];
                }
                for(int i=0;i<N;i++){
                    System.out.print(ans2[i]+" ");
                }
            }else{
                for(int i=0;i<N;i++) {
                    System.out.print(ans1[i] + " ");
                }
            }
            System.out.println();
            T--;
        }
    }
}
