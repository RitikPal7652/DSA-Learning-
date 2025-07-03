package DSA.Heap;
import java.util.LinkedList;
import static java.util.Collections.swap;
public class Insertion_In_MinHeap_ByList {
    public static void insertElement(LinkedList<Integer> heap,int val){
        heap.add(val);
        int idx=heap.size()-1;//In this case it is 6.
        //push up till not reached at correct positiion.
        push_Up_In_Heap(heap,idx);
    }

    public static void push_Up_In_Heap(LinkedList<Integer> heap, int i) {
        int parent_Idx=(i-1)/2;//   [10,20,30,40,50,60]
        if(i==0)    return;        // 0, 1, 2, 3, 4, 5

        //If parent is greater than child no swap.
        if(heap.get(parent_Idx)<heap.get(i))    return;

        //If parent is less than child then swap parent and child.
        swap(heap,i,parent_Idx);

        //Recursive call for push up in heap binary tree.
        push_Up_In_Heap(heap,parent_Idx);
    }

    public static void main(String[] args) {
        LinkedList<Integer> heap =new LinkedList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);

        System.out.println("Original heap: "+heap);
        insertElement(heap,25);
        System.out.println("After inserting element in heap: "+heap);
    }
}
