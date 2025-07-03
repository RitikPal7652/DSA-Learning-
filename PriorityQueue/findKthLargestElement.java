package DSA.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class findKthLargestElement {
    public static void main(String[] args) {
        //**************1st Approach***************
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<Integer>();
          l.add(1);
          l.add(4);
          l.add(3);
          l.add(5);
          l.add(6);

        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
//          ArrayList<Integer> arr=new ArrayList<>(l);
//            Collections.sort(arr);
//            Collections.reverse(arr);

//        System.out.println(arr.get(k-1));

        //**************2nd Approach***************
        /*
        Approach:
        1. Make a priority queue of k size.
        2. Store greater element of list in it, and kth greater element
            at front of priority queue.
        3. Return the front of priority queue.
        4. Elements are assigned according to the priority of elements.
         */
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<l.size();i++){
            if(pq.size()==k){
                if(pq.peek()<l.get(i)){
                    pq.poll();  //First remove the element from front.
                    pq.add(l.get(i));//Then add element in priority queue.
                }
                //skip
                continue;//Because we don't want to add element again.
            }
            //In normal case.
            pq.add(l.get(i));
        }
        System.out.println("Kth largest element is: "+(pq.peek()));
    }
}
//whenever kth is given try to add priority queue concept.