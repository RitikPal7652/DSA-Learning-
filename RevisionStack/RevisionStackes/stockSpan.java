package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class stockSpan {
    public static int[] stockspan(int[]arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0] = 1;

        for(int i=1; i<n; i++){
            while(arr[st.peek()]<arr[i] && st.size()>0){
                st.pop();
            }
            res[i] = i-st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] res = stockspan(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
