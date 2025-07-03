package DSA.BST_iNTERVIEW;

import java.util.Scanner;

public class insert_Elemet_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the size of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Increased size by 1.
        n=n+1;
        
        System.out.println("Enter the position where u wanna insert element: ");
        int pos=sc.nextInt();
        int x=pos;
        for(int i=pos;i<n;i++){
            if(pos!=n-1)
            arr[pos+1] = arr[pos];
        }
        System.out.println("Enter the element u wanna insert at "+x+" Index: ");
        int val=sc.nextInt();
        arr[x] = val;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
