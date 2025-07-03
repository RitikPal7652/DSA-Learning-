package DSA.InterviewProblemStack;

import java.util.Stack;

public class consecutiveSubsequence {
    public static int[] subSequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i])
                st.push(arr[i]);

            else if(st.peek()==arr[i]) {
                if(i==n-1 || arr[i]!=arr[i+1])    st.pop();
                if(arr[i]==arr[i+1]) {
                    //do nothing.
                }
            }
        }

        int[] res = new int[st.size()];
        int m = res.length;
        for(int i=m-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,10,10,10,3,4,4,4,5,7,2};
        int[] res = subSequence(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
