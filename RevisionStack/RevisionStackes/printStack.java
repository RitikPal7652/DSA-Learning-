package DSA.RevisionStack.RevisionStackes;

import java.util.*;
public class printStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        while(st.size()>0){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
