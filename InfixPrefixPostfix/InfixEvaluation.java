package DSA.InfixPrefixPostfix;

import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        String s = "9+5-3*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int val2 = st.pop();
                    int val1 = st.pop();

                    if (op.peek() == '+') st.push(val1 + val2);
                    if (op.peek() == '-') st.push(val1 - val2);
                    if (op.peek() == '*') st.push(val1 * val2);
                    if (op.peek() == '/') st.push(val1 / val2);

                    op.pop();
                }
                op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    //Work
                    /*
                    We don't need to apply some other condition bcoz
                    op.peek kii priority is always >=ch then apply work
                    otherwise not.

                    But no matter what is on the op.peek() {+ - * /} the
                    precedence of these operators are always greater than
                    or equal to the ch operator.
                     */
                    int val2 = st.pop();
                    int val1 = st.pop();
                    if (op.peek() == '+') st.push(val1 + val2);
                    if (op.peek() == '-') st.push(val1 - val2);
                    if (op.peek() == '*') st.push(val1 * val2);
                    if (op.peek() == '/') st.push(val1 / val2);

                    op.pop();
                    //push
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //Work
                        /*
                        1. Bcoz We apply here condition and the condition is must
                        to apply here bcoz now it do matter what is present
                        or what operator is present on the op.peek position.

                        2. Bcoz if + or - is present on op.peek() position then
                        as we know their precedence is less than that of * and /.
                        So it do not work here if + and - is present on the op.peek()
                        position.

                        3. op.peek() kii precedence >= ch and ch is here only * ad /.
                         */
                        int val2 = st.pop();
                        int val1 = st.pop();

                        if (op.peek() == '*') st.push(val1 * val2);
                        if (op.peek() == '/') st.push(val1 / val2);

                        op.pop();

                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
            while (st.size() > 1) {
                int val2 = st.pop();
                int val1 = st.pop();

                if (op.peek() == '+') st.push(val1 + val2);
                if (op.peek() == '-') st.push(val1 - val2);
                if (op.peek() == '*') st.push(val1 * val2);
                if (op.peek() == '/') st.push(val1 / val2);

                op.pop();
            }
            System.out.println(st.peek());
        }
    }

