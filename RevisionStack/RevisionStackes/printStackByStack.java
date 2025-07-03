package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class printStackByStack {
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

        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
    }
}
