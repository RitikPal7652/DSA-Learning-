package DSA.InterviewProblemStack;

import java.util.Stack;

public class NextGreaterElementByStack {
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        int n=arr.length;
        st.push(arr[n-1]);

        for(int i=n-2; i>=0; i--){
            while(st.peek()<arr[i] && st.size()>0){
                st.pop();
            }
            if(st.size()==0)    res[i] = -1;
            else                res[i] = st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = nextGreater(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
