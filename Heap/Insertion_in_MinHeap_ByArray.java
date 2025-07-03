package DSA.Heap;

public class Insertion_in_MinHeap_ByArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,-1};
        int Org_size=5;
        System.out.println("Original Array is: ");
        for(int i=0;i<Org_size;i++){
            System.out.print(arr[i]+ " ");
        }

        Org_size=insert_Element(arr,Org_size,25);
        System.out.println("\nAfter Inserting Element is: ");
        for(int i=0;i<Org_size;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void swap(int[] arr,int i,int r){
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
    }
    private static int insert_Element(int[] arr,int size, int val) {
        arr[size]=val;
        //Now push up till then root is not reached at its correct position.
        push_Up(arr,size);
        return size+1;
    }

    private static void push_Up(int[] arr, int i) {
        int parent_Idx=(i-1)/2;
        //If parent root is less than root then return it
        if(i==0 || arr[parent_Idx]<arr[i]) return;
        //If parent root is greater than root then swap it.
        swap(arr,i,parent_Idx);
        //Recursive Call
        push_Up(arr,parent_Idx);
    }
}
