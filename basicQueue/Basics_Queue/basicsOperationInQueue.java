package DSA.basicQueue.Basics_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basicsOperationInQueue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        System.out.println(q.poll()); //Like a pop.
        System.out.println(q);
        System.out.println("Size is: "+q.size());
        q.remove();
        System.out.println("Size is: "+q.size());
        q.remove();
        System.out.println("Size is: "+q.size());
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println("Size is: "+q.size());
        System.out.println(q);
    }
}