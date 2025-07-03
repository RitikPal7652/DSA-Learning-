package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class displayReverseRecursively {
    public static void insertBottom(Stack<Integer> st, int x){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void displayByRec(Stack<Integer> st){
        //Base Case.
        if(st.size()==1){
            return;
        }
        //Store top element in some temporary variable.
        int top = st.pop();
        //Recursive Work.
        displayByRec(st);
        //Self Work.
        insertBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        displayByRec(st);
        System.out.println(st);
    }
}
