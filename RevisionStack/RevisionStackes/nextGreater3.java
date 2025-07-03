package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class nextGreater3 {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1; i<n; i++){

            while(st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        for(int i=0; i<n; i++){
            if(res[i]==0)   res[i] = -1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] res = nextGreater(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
