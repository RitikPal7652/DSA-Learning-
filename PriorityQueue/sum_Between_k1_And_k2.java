package DSA.PriorityQueue;
import java.util.*;
import java.util.Collections;

public class sum_Between_k1_And_k2 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);
        int k1=3;
        int k2=6;
//        Brute Force Approach
//        Collections.sort(arr);  //O(N*logN)
//        We have to find sum between k1 and k2.
          int sum=0;
//        for(int i=k1;i<k2-1;i++){
//            sum+=arr.get(i);    // O(k2-k1)
//        }

        //Optimal solution hii mera solution hai.
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //Now our list is sorted in decreasing order. Apply reverse loop.
        for(int i=0;i<arr.size();i++){
            pq.add(arr.get(i));         //O(N*logN + (N-k2)logN)

            if(pq.size()>k2)    pq.remove();
        }
        //Now we have from 1st to k2 elements. We don't need (k2)th element.
        pq.remove();
        //We have 1 to k2-1 elements
        while(pq.size()!=k1) {  //O(k2-k1)logk2 //As total elements are k2 so logk2.
            sum+=pq.remove();
        }
        System.out.println("Sum is : "+sum);
        // Time Overall complexity: O(n*logn + n*logn - k2*logn + k2logk2 - k1logk2= O(n*logn)
        //Space complexity: O(k2).
    }
}
