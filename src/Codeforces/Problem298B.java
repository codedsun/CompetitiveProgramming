package Codeforces;

import java.util.Scanner;

public class Problem298B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sx = sc.nextLong();
        long sy = sc.nextLong();
        long ex = sc.nextLong();
        long ey = sc.nextLong();
        String s = sc.next();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            switch (ch){
                case 'S':{
                    if(sy>ey){
                        sy = sy-1;
                    }
                    break;
                }
                case 'E': {
                    if(sx<ex){
                        sx = sx+1;
                    }
                    break;
                }

                case 'W':{
                    if(sx>ex){
                        sx = sx-1;
                    }
                    break;
                }

                case 'N': {
                    if(sy<ey){
                        sy = sy+1;
                    }
                    break;
                }
            }
            if(sx == ex && sy==ey){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("-1");
        }else{
            System.out.println(index+1);
        }
    }

    private static boolean checkEqual(int x, int y, int x1, int y1) {
        return x == x1 && y == y1;
    }

}
