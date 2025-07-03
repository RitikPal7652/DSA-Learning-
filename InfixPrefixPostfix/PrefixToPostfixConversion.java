package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class PrefixToPostfixConversion {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> st = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);

            if(ch>=48 && ch<=57){
                String c = ""+ch;
                st.push(c);
            } else{
                String val1 = st.pop();
                String val2 = st.pop();

                    String f = val1 + val2 + ch;
                    st.push(f);
                }
            }
        String postFix = st.peek();
        System.out.println(postFix);
    }
}
