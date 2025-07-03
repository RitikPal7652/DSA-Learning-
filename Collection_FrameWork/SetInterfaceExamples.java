package DSA.Collection_FrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExamples {
    static void Hashset(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        System.out.println(st);
        st.add(1); //Duplicates are not allowed.
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(5));
    }

    static void LinkedHashSet(){
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(30);
        System.out.println(st);
    }

    static void TreeSet(){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(48);
        st.add(15);
        st.add(30);
        System.out.println(st);
    }
    public static void main(String[] args) {
        //Hashset();       //Unordered and Unique.
        //LinkedHashSet(); // Order of Insertion maintain.
            TreeSet();     //   Sorted Order.
    }
}
