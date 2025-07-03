package DSA.InterviewProblemStack;

import java.util.Stack;

public class NextGreater2 {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(0);

        for(int i=1; i<arr.length; i++){
            while(arr[i]>arr[st.peek()] && st.size()>0){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while(st.size()>0){
            res[st.peek()] = -1;
            st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = nextGreater(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Next Greater Element: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
