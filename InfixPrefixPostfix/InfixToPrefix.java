package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        System.out.println(s);
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>=48 && ch<=57) {
                String q = ""+ch;
                st.push(q);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char t = op.peek();

                    String w = t + val1 + val2;
                    st.push(w);
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char f = op.peek();

                    String g = f + val1 + val2;
                    st.push(g);

                    op.pop();
                    //push
                    op.push(ch);
                }

                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //Work.
                        String val2 = st.pop();
                        String val1 = st.pop();
                        char j = op.peek();

                        String d = j + val1 + val2;
                        st.push(d);

                        op.pop();
                        op.push(ch);
                    }
                    else{
                        //Do not work.
                        op.push(ch);
                    }
                }
            }
        }
        while(st.size()>1){
            String val2 = st.pop();
            String val1 = st.pop();
            char v = op.peek();

            String k = v + val1 + val2;
            st.push(k);

            op.pop();
        }
        String prefix = st.peek();
        System.out.println(prefix);
    }
}
