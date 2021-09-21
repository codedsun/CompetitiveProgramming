package Codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Problem1574A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            int n = sc.nextInt();
            Stack<String> s = new Stack<String>();
            generateParenthesis(n, 0,0, "",s);
            for (int i = 0; i < n; i++) {
                System.out.println(s.get(i));
            }
        }
    }

    static void generateParenthesis(int n, int open, int close, String s, Stack<String> ans){
        if(ans.size()>n){
            return;
        }
        if(open==n && close==n){
            ans.push(s);
            return;
        }

        if(open<n){
            generateParenthesis(n, open+1, close, s+"(", ans);
        }
        if(close<open){
            generateParenthesis(n, open, close+1, s+")", ans);
        }

    }
}
