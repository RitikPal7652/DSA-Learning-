package DSA.InfixPrefixPostfix;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<Integer> st = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascii = (int)ch; //To typecast into integer from character.

            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();

                /*
                In prefix Evaluation we start from last element and goes til
                first element of string. In this case, val1 is present at top
                position and val2 is present at second top position. Bcoz we
                start from the last element of the array.
                 */
                if(ch=='+') st.push(val1 + val2);
                if(ch=='-') st.push(val1 - val2);
                if(ch=='*') st.push(val1 * val2);
                if(ch=='/') st.push(val1 / val2);
            }
        }
        System.out.println(st.peek());
    }
}
