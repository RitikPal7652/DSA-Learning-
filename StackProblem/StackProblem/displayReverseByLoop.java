package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class displayReverseByLoop {
    public static void display(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        display(st);
    }
}
