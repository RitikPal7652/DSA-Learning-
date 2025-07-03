package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class removeFromBottomRecursively {
    public static void removeElmt(Stack<Integer> st){
        //Base Case.
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        //Recursive Work.
        removeElmt(st);
        //Self Work.
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        removeElmt(st);
        System.out.println(st);
    }
}
