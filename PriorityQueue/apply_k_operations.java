package DSA.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class apply_k_operations {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(8);
        l.add(9);
        l.add(5);
        l.add(1);
        int k=3;
       //Converting list to Arrays.
       // Arrays.asList(arr);
       // Important to write.
        System.out.println(largest_NoS_After_K_operations(l,k));
    }

    private static int largest_NoS_After_K_operations(List<Integer> l, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(l);   //O(n)
        //By default it is Min Heap.
        for(int i=0;i<k;i++){   //k*logN
            int first=pq.remove();
            int second=pq.remove();
            pq.add(first*second);
        }
        //To fetch out the largest element from the priority Queue.
        while(pq.size()!=1) {// N-k(logN)
            pq.remove();
        }
        //Overall time complexity: O(N+NlogN)
        return pq.peek();
    }
}
