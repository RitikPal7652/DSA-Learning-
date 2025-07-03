package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class copyContentOneStckToAnother {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }

        Stack<Integer> pt = new Stack<>();
        while(rt.size()>0){
            pt.push(rt.pop());
        }
        System.out.println(pt);
    }
}
