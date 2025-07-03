package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class PostixToPrefixConversion {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>=48 && ch<=57){
                String f = ""+ch;
                st.push(f);
            }
            else{ //means ch = [+, -, *, /].
                String val2 = st.pop();
                String val1 = st.pop();
                /*
                We don't need to see which operator is present bcoz
                at the end it is a string and we have to append it
                ina given string.
                 */
                    String d = ch+val1+val2;
                    st.push(d);
                }
            }
        String prefix = st.peek();
        System.out.println("Postfix To prefix Conversoion is: "+prefix);
    }
}
