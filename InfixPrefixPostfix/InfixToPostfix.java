package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        System.out.println(s);
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>=48 && ch<=57) {
                String f = ""+ch;
                st.push(f);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char g = op.peek();

                    String j = val1 + val2 + g;
                    st.push(j);

                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char b = op.peek();

                    String d = val1 + val2 + b;
                    st.push(d);

                    op.pop();
                    //push
                    op.push(ch);
                }

                if(ch=='*' || ch=='/') {
                    if(op.peek()=='*' || op.peek()=='/'){
                        //* and / hai to kaam kro otherwise not.
                        String val2 = st.pop();
                        String val1 = st.pop();
                        char b = op.peek();

                        String d = val1 + val2 + b;
                        st.push(d);

                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(st.size()>1){
            String val2 = st.pop();
            String val1 = st.pop();
            char b = op.peek();

            String d = val1 + val2 + b;
            st.push(d);

            op.pop();
        }
        String postFix = st.peek();
        System.out.println(postFix);
    }
}
