import java.util.Stack;

/**
 * @author : codedsun
 * Created on 27/09/18
 */
public class Hello {
    public static void main(String[] args) {
        String values[] = new String[]{"{}[]()"};
        Stack<Character> st = new Stack();
        String[] ans = new String[1];

        ans[0] = "NO";
        Character z;
        for(int i=0; i<values.length; i++) {
            z = values[i].charAt(i);
            System.out.println(i);
            if(z=='(' || z=='{' || z== '[') {
                System.out.println("PUSING"+z);
                st.push(z);
                continue;
            }

            if(st.isEmpty()) {
                ans[0] = "NO";
                System.out.println(ans[0]);
            }

            switch(z){

                case '}' : z = st.pop();
                    System.out.println("Switch"+z);
                    if(z!='{') {
                        System.out.println(ans[0]);
                    }
                    break;
                case ')' :
                    System.out.println("Switch"+z);
                    z = st.pop();
                    if(z!='(') {
                        System.out.println(ans[0]);

                    }
                    break;

                case ']' :
                    System.out.println("Switch"+z);
                    z = st.pop();
                    if(z!='[') {
                        System.out.println(ans[0]);

                    }
                    break;
            }
        }

        if(st.isEmpty()) {
            ans[0] = "YES";
            System.out.println(ans[0]);

        }
        else {
            ans[0] = "NO";
            System.out.println(ans[0]);

        }
    }
}
