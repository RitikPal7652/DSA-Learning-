package DSA.Collection_FrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExample {

    static void stackExamples(){
        Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(5);
            st.push(6);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
    static void LinkedList() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l.getFirst());
        System.out.println(l.get(1));
        System.out.println(l);
        System.out.println(l.get(2));
    }

    static void ArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.set(1, 10);
        System.out.println(arr);
        System.out.println(arr.contains(1));
    }
    public static void main(String[] args) {
        //ArrayList();
        //LinkedList();
        stackExamples();
    }
}
