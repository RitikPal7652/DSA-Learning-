package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class removeElmtBottom {
    public static void removeBottom(Stack<Integer> st){
        //Make a temporary stack.
        Stack<Integer> rt = new Stack<>();

        //Jab tkk stack ka size 1 se bda rhe.
        while(st.size()>1){
            rt.push(st.pop());
        }

        //To pop or remove last element from the original(st) stack.
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        removeBottom(st);
    }
}
