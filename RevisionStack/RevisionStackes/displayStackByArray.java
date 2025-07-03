package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class displayStackByArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        int n = st.size();
        int[] arr = new int[n];

        //To fill the elements from the stack to array.
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        //To fill the array elements into Stack from starting.
        for(int i=0; i<arr.length; i++){
            st.push(arr[i]);
        }
        System.out.println(st);
    }
}
