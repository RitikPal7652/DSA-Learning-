package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;

public class nextGreaterElmnt {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = -1;

            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Next Greater Element is: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
