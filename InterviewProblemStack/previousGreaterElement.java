package DSA.InterviewProblemStack;

import java.util.Stack;

public class previousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int n=  arr.length;
        int[] res = new int[n];
        res[0] = -1;
        for(int i=1; i<arr.length; i++) {
            res[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break; //SO that value fill only one time.
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Previous Greater Element is: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
