package DSA.Heap;

public class deletionInMaxHeap {
    public static void main(String[] args) {
        int[] arr = {70, 50, 60, 30, 40, 20, 10};
        int count = deleteFromMaxHeap(arr);
        System.out.println();
        System.out.println("After removing Minimum element tree is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int deleteFromMaxHeap(int[] arr) {
        int n = arr.length;
        swap(arr, 0, n - 1);
        n--;//Decrease the size of array by 1
        pushDown(arr,0);
        return n;
    }

    private static void pushDown(int[] arr, int idx) {
        int n=arr.length-2;
        if(idx==n)  return; //Base Case.

        int left=(2*idx)+1; //Think like a tree.
        int right=(2*idx)+2;

        int biggest=idx;
        if(left<=n && arr[left]>arr[biggest])  biggest=left;
        if(right<=n && arr[right]>arr[biggest])    biggest=right;

        if(biggest==idx)   return;

        swap(arr,idx,biggest);
        pushDown(arr,biggest);
    }
}
