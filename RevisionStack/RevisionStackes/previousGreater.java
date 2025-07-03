package DSA.RevisionStack.RevisionStackes;

import java.util.Stack;

public class previousGreater {
    public static int[] stockspan(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        for(int i=0; i<res.length; i++){
            if(res[i]==0)   res[i] = -1;
        }
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
