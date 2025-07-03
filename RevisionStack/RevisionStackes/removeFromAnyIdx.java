package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class removeFromAnyIdx {
   public static void removeAnyIdx(Stack<Integer> st, int idx) {
        Stack<Integer> rt = new Stack();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();

        while(rt.size()>0){
            st.push(rt.pop());
        }
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

        System.out.println("Enter the index which u want to remove: ");
        int x = sc.nextInt();

        removeAnyIdx(st, x);
        System.out.println(st);
    }
}
