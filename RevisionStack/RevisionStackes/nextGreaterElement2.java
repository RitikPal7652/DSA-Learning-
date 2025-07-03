package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement2 {
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            
            if(st.size()==0)    res[i] =-1;
            else                res[i] = st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of Array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter the Elements of Array: ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = nextGreater(arr);
        System.out.println("Next Greater Element Array is: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
