package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class removeSubsequence {
    public static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i])  st.push(arr[i]);
            else{
                if(arr[i]==st.peek()){
                    if(i==n-1 || arr[i]!=arr[i+1]){
                        //i-1 checks that if we are at last element of the array.
                        st.pop();
                    }
                    else{
                        //do nothing.
                    }
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = remove(arr);
        System.out.println("After removing Consecutive Subsequences array becomes: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
