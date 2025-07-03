package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class insertElmtAtBottom {
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

       Stack<Integer> pt = new Stack<>();
       pt = insertAtBottom(st, 45);
        System.out.println(pt);
    }
}
