package DSA.InterviewProblemStack;

import java.util.Stack;

public class previous_SmallestElmnt_ByStack {
    public static int[] previousSmallest(int[] arr){
        int n= arr.length;
        int[] res = new int[n];
        Stack<Integer> st= new Stack<>();

        res[0] = -1;
        st.push(arr[0]);

        for(int i=1; i<arr.length; i++){
            while(arr[i]<st.peek() && st.size()>0){
                st.pop();
            }
            if(st.size()==0)    res[i] = -1;
            else                res[i] = arr[i];

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,75,85};
        int[] res = previousSmallest(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Previous Smallest Element is: ");

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
