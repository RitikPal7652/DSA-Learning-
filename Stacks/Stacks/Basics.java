package DSA.Stacks.Stacks;
import java.util.Stack;
public class Basics {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    //To add an element from the top.
    st.push(1);
    //To print the stack.
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println("Size of: "+st.size());
    st.push(2);
        System.out.println(st);
        System.out.println("Size of: "+st.size());
    st.push(3);
        System.out.println(st);
        System.out.println("Size of: "+st.size());
    st.push(4);
        System.out.println(st);
        System.out.println("Size of: "+st.size());
    st.push(5);
        System.out.println(st);
        System.out.println("Size of: "+st.size());
    st.push(6);
        System.out.println(st);
        System.out.println("Size of: "+st.size());

        //To retrieve an element without remove it from the stack.
        System.out.println(st.peek());
        System.out.println(st);
        //To retrieve an element with remove it from the stack.
        st.pop();
        System.out.println(st);
    while(st.size()>2){
        st.pop();
    }
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.pop());
    }
}
