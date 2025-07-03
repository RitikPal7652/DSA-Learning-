package DSA.Heap;

public class heapSort_Descending {
    public static void heapify_Heap(int[] arr){
        int n=arr.length;
        int first_non_leafNode=((arr.length-1)-1)/2;//Parent node
        for(int i=first_non_leafNode;i>=0;i--){
            pushDown(arr,i,arr.length-1);
        }
    }
    private static void pushDown(int[] arr, int idx,int n) {
        //int n=arr.length-2;
        if(idx==n)  return; //Base Case.

        int left=(2*idx)+1; //Think like a tree.
        int right=(2*idx)+2;

        int smallest=idx;
        if(left<=n && arr[left]<arr[smallest])  smallest=left;
        if(right<=n && arr[right]<arr[smallest])    smallest=right;

        if(smallest==idx)   return;

        swap(arr,idx,smallest);
        pushDown(arr,smallest,n);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void HeapSort(int[] arr){
        /*Replace last element of array with first element then towards
         left means leave last element in every iteration of loop.bcoz at
         each iteration we place one element at its correct position.

      The quick brown the fox jumps right over the lazy dog
         */
        //First of all heapify: means convert array into min heap.

        heapify_Heap(arr);
        int n=arr.length-1;
        for(int i=n;i>0;i--){
            swap(arr,0,i);
            pushDown(arr,0,i-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {90,80,70,20,10,50,60};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        HeapSort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
