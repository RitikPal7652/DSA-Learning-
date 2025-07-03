package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class PostfixToInfixConversion {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>=48 && ch<=57){
                String t = ""+ch;
                st.push(t);
            }
            else{
                String val2 = st.pop();
                String val1 = st.pop();

                String h = "(" + val1 + ch + val2 + ")";
                st.push(h);
            }
        }
        String infix = st.peek();
        System.out.println(infix);
    }
}
