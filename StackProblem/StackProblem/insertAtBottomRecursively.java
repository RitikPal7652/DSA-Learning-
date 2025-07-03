package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class insertAtBottomRecursively {
    public static void insert(Stack<Integer> st, int x){
        //Base Case.
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        //Recursive Work.
        insert(st, x);
        //Self Work/
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

        insert(st, 49);
        System.out.println(st);
    }
}
