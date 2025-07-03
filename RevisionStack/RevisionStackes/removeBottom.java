package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class removeBottom {
    public static void removeBOTTOM(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeBOTTOM(st);
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

        removeBOTTOM(st); //It is actualy call by reference.
        System.out.println(st);
    }
}
