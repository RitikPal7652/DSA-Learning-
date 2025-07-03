package DSA.Heap;

import static DSA.Heap.Insertion_in_MinHeap_ByArray.swap;
import static DSA.Heap.heapify_toGenerate_MaxHeap.heapify_Heap;

public class HeapSort_Ascending {
    private static void pushDown(int[] arr, int idx,int n) {
        if(idx==n)  return; //Base Case.

        int left=(2*idx)+1; //Think like a tree.
        int right=(2*idx)+2;

        int smallest=idx;
        if(left<=n && arr[left]>arr[smallest])  smallest=left;
        if(right<=n && arr[right]>arr[smallest])    smallest=right;

        if(smallest==idx)   return;

        swap(arr,idx,smallest);
        pushDown(arr,smallest,n);
    }
    public static void main(String[] args) {
        int[] arr = {70, 50, 60, 30, 40, 20, 10};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        heapSort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private static void heapSort(int[] arr) {
        //Heapify
        heapify_Heap(arr);
        int n=arr.length-1;
        //Starting from last go till start and place one max node at its correct position.
        for(int i=n;i>=0;i--){
            swap(arr,0,i);
            pushDown(arr,0,i-1);
        }
    }
}
