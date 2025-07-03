package DSA.InterviewProblemStack;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        res[0] = 1;
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(arr[i]>arr[st.peek()] && st.size()>0){
                st.pop();
            }
            if(st.size()==0)    res[i] = 1;
            else                res[i] = i-st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] res = stockSpan(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Stock Span is: ");

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
