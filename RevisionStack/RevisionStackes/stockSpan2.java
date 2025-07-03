package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class stockSpan2 {
    public static int[] stockspan(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()] = st.peek()-i;
                st.pop();
            }
            st.push(i);
        }
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,50,75,85};
        int[] res = stockspan(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
