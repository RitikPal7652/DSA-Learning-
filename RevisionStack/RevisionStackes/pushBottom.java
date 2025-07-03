package DSA.RevisionStack.RevisionStackes;

import java.util.*;

public class pushBottom {
    public static void pushAtBottom(Stack<Integer> st, int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println("Enter the number u want to add: ");
        int x = sc.nextInt();
        pushAtBottom(st, x);
        System.out.println("Changed Stack is: ");
        System.out.println(st);
    }
}
