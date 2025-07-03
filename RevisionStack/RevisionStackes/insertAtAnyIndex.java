package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class insertAtAnyIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in which index u want to print: ");
        int idx = sc.nextInt();
        System.out.println("Enter the element u want to insert: ");
        int x = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("After Inserting New element at the bottom is: ");
        System.out.println(st);
    }
}
