package DSA.Heap;

public class deletionInMinHeap {
    public static void main(String[] args) {
        int[] arr = {5,20,10,40,50,30,60};
        int count=deleteFromMinHeap(arr);
        System.out.println();
        System.out.println("After removing Minimum element tree is: ");
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int deleteFromMinHeap(int[] arr) {
        int n=arr.length;
        //Swap first and last element of tree.
        swap(arr,0,n-1);
        n--;
        /*We can't delete an element from the array we simply decrease
          the length of array.*/
        //Now push down our node to till last.
        pushDown(arr,0);
        return n;
    }

    private static void pushDown(int[] arr, int idx) {
        /*
        1.At starting, First we declare the smallest as our index.
        2.Now we find left and right and from both of them we find
            minimum and compare it with the smallest node/number.
        3.If left is less than smallest make smallest = left.
        4.If right is less than smallest make smallest = right.
        5.Now swap smallest with index.

        Now we perform operation on n-2th index.bcoz from our side
        5 is deleted.
         */

        int n=arr.length-2;
        if(idx==n)  return;


        int left=(2*idx)+1;
        int right=(2*idx)+2;
        int smallest=idx;

        if(left<=n && arr[left]<arr[smallest]) smallest = left;
        if(right<=n && arr[right]<arr[smallest])    smallest=right;

        if(smallest==idx)   return;
        //swap it, means smallest is not equal to index.
        swap(arr,idx,smallest);
        //Recursive Call
        pushDown(arr,smallest);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
