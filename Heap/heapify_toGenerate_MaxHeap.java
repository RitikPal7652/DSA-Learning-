package DSA.Heap;

public class heapify_toGenerate_MaxHeap {
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

        int biggest=idx;
        if(left<=n && arr[left]>arr[biggest])  biggest=left;
        if(right<=n && arr[right]>arr[biggest])    biggest=right;

        if(biggest==idx)   return;

        swap(arr,idx,biggest);
        pushDown(arr,biggest,n);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //Heapify means to build a tree
        int[] arr={10,20,30,40,50,60,70};
        heapify_Heap(arr);
        System.out.println("Max Heap array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
