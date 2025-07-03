package DSA.Heap;

import java.util.LinkedList;

import static java.util.Collections.swap;

public class Insertion_In_Max_Heap_ByList {
    public static void push_Up(LinkedList<Integer> heap,int i){
        int parent_Idx=(i-1)/2;
        //If parent is greater than child then ok return
        if(i==0 || heap.get(parent_Idx)>heap.get(i))    return;
        //else swap both parent and child.
        swap(heap,i,parent_Idx);
        //Recursive call
        push_Up(heap,parent_Idx);
    }
    public static void insert(LinkedList<Integer> heap,int val){
        heap.add(val);
        int s=heap.size()-1;//16
        //push up till them root is not reached at its correct position.
        push_Up(heap,s);
    }
    public static void main(String[] args) {
        LinkedList<Integer> heap=new LinkedList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        heap.add(40);

        System.out.println(heap);
        insert(heap,70);
        System.out.println("\n"+heap);
    }
}
