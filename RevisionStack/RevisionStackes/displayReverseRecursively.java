package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class displayReverseRecursively {
    public static void insertAtBotom(Stack<Integer> st, int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top = st.pop();
        insertAtBotom(st, val);
        st.push(top);
    }
    public static void reverseDisplay(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverseDisplay(st);
        insertAtBotom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println("Changed Stack is: ");
        reverseDisplay(st);
        System.out.println(st);
    }
}
