package DSA.Stacks.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class reverseOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of elements u want to print");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
        System.out.println(st);

        //REVERSE ORDER.
        Stack<Integer> rt = new Stack<>();

        while(st.size()>0){
            int x = st.peek();//To access an element from the st stack.
            rt.push(x);//To add an element from the top of rt Stack.
            st.pop();//To remove an element from the st stack.
        }
        System.out.println(rt);
    }
}
